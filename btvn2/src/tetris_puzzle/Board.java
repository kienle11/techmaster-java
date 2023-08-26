package tetris_puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel {
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
public Board(){
    looper=new Timer(500, new ActionListener() {
        int n =0;
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(n++);
            y++;
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
        for (int i=0;i<shape.length;i++){
            for (int j=0;j<shape[0].length;j++){
                g.setColor(shape[i][j]);
                g.fillRect(i*blockSide,j*blockSide,blockSide,blockSide);
            }
        }
        g.setColor(Color.WHITE);
        //Draw the board
        for (int row=0;row<boardHeight;row++){
            g.drawLine(0,blockSide*row,blockSide*boardWidth,blockSide*row);
        }
        for (int col = 0; col < boardWidth+1; col++) {
            g.drawLine(blockSide * col, 0, blockSide * col, blockSide * boardHeight);
        }
    }
}
