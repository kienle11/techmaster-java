package tetris_puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements KeyListener {
    private static int fps=60;
    private static int delay = 1000/fps;
    public static final int boardWidth=10;
    public static final int boardHeight=20;
    public static final int blockSide=30;
    private Timer looper;
    private Color[][] board=new Color[boardWidth][boardHeight];
   private Color[] colors={Color.decode("#F93644"), Color.decode("#1299E2"), Color.decode("#97D151"),
    Color.decode("#156EFF"), Color.decode("#2BE4FF"), Color.decode("#FF1ACE"), Color.decode("#9032D1")};
    /* private int[][] shape1 = {
            {1,1,1},
            {0,1,0}
    };*/
    private Shape[] shapes=new Shape[7];
    private Shape currentShape ;

public Board(){
    shapes[0]=new Shape(new int[][]{
            {1,1,1,1}
    },this,colors[0]);
    shapes[1]=new Shape(new int[][]{
            {1,1,1},
            {0,1,0}
    },this,colors[1]);
    shapes[2]=new Shape(new int[][]{
            {1,1,1},
            {1,0,0}
    },this,colors[2]);
    shapes[3]=new Shape(new int[][]{
            {1,1,1},
            {0,0,1}
    },this,colors[3]);
    shapes[4]=new Shape(new int[][]{
            {0,1,1},
            {1,1,0}
    },this,colors[4]);
    shapes[5]=new Shape(new int[][]{
            {1,1,0},
            {0,1,1}
    },this,colors[5]);
    shapes[6]=new Shape(new int[][]{
            {1,1},
            {1,1}
    },this,colors[6]);
    currentShape=shapes[0];
    looper=new Timer(delay, new ActionListener() {
        int n =0;

        @Override
        public void actionPerformed(ActionEvent e) {
            update();
            repaint();
        }
    });
    looper.start();
}
public void update(){
currentShape.update();
}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        currentShape.render(g);


        g.setColor(Color.white);
        //Draw the board
        for (int row=0;row<boardHeight;row++){
            g.drawLine(0,blockSide*row,blockSide*boardWidth,blockSide*row);
        }
        for (int col = 0; col < boardWidth+1; col++) {
            g.drawLine(blockSide * col, 0, blockSide * col, blockSide * boardHeight);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if (e.getKeyCode()==KeyEvent.VK_DOWN){
        currentShape.speedUp();
    }
    if (e.getKeyCode()==KeyEvent.VK_RIGHT){
        currentShape.moveRight();
    }
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            currentShape.moveLeft();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
           currentShape.speedDown();
        }
    }
}
