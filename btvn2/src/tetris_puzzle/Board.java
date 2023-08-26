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
    private Color[][] shape = {
            {Color.RED, Color.RED, Color.RED},
            {null, Color.RED, null}
    };
    private int x=4, y=0; //X la column, Y la row
    private int normal=600;
    private int fast=50;
    private int delayTimeForMovement=normal;
    private long beginTime;
    private int deltaX=0;
    private boolean coolision=false;
public Board(){
    looper=new Timer(delay, new ActionListener() {
        int n =0;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (coolision) {return;}
            //Check movement horizontal
            if (!(x+deltaX+shape[0].length>10)&&!(x+deltaX<0)){
            x+=deltaX;}
            deltaX=0;
            if (System.currentTimeMillis()-beginTime>delayTimeForMovement){
               if (!(y+1+shape.length>boardHeight)){
                   y++;
               }else {coolision=true;}
                beginTime=System.currentTimeMillis();
            }
            repaint();
        }
    });
    looper.start();
}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        //Draw the shape
        for (int row=0;row<shape.length;row++){
            for (int col=0;col<shape[0].length;col++){
                if (shape[row][col]!=null) {
                    g.setColor(shape[row][col]);
                    g.fillRect(col * blockSide+x*blockSide, row * blockSide+y*blockSide, blockSide, blockSide);
                }}
        }
        g.setColor(Color.black);
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
        delayTimeForMovement=fast;
    }
    if (e.getKeyCode()==KeyEvent.VK_RIGHT){
        deltaX=1;
    }
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            deltaX=-1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
            delayTimeForMovement=normal;
        }
    }
}
