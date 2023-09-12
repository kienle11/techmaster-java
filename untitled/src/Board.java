import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Board extends JPanel implements KeyListener {
    public static final int blockSide=30;
    public static final int  boardWidth=10, boardHeight=20;
    public static final int fps=60;
    private static final int delay=1000/fps;
    private Timer looper;
    private Shape[]shapes=new Shape[7];
    private Shape currentShape;
    private Color[] colors={Color.decode("#F93644"), Color.decode("#1299E2"), Color.decode("#97D151"),
            Color.decode("#156EFF"), Color.decode("#2BE4FF"), Color.decode("#FF1ACE"), Color.decode("#9032D1")};

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
                {1,1,0},
                {0,1,1}
        },this,colors[4]);
        shapes[5]=new Shape(new int[][]{
                {0,1,1},
                {1,1,0}
        },this,colors[5]);
        shapes[6]=new Shape(new int[][]{
                {1,1},
                {1,1}
        },this,colors[6]);
        currentShape=shapes[3];
        looper=new Timer(delay, new ActionListener() {
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
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,getWidth(),getHeight());
        currentShape.render(g);
        g.setColor(Color.white);
        for (int i=0; i<boardHeight;i++){
            g.drawLine(0,i*blockSide,blockSide*boardWidth,i*blockSide);//Kẻ đường nằm ngang
        }
        for (int j=0;j<boardWidth+1;j++){
            g.drawLine(j*blockSide,0,j*blockSide,boardHeight*blockSide);//Kẻ đường thẳng
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if (e.getKeyCode()==KeyEvent.VK_A){
        currentShape.goLeft();
    }
    if (e.getKeyCode()==KeyEvent.VK_D){
        currentShape.goRight();
    }
    if (e.getKeyCode()==KeyEvent.VK_S){
        currentShape.goDown();
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_S){
            currentShape.releaseGoDown();
        }
    }
}
