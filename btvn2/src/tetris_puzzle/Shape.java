package tetris_puzzle;

import java.awt.*;

import static tetris_puzzle.Board.blockSide;
import static tetris_puzzle.Board.boardHeight;

public class Shape {
    private int x=4, y=0; //X la column, Y la row
    private int normal=600;
    private int fast=50;
    private int delayTimeForMovement=normal;
    private long beginTime;
    private int deltaX=0;
    private boolean coolision=false;
    private int[][]coords;
    private Board board;
    private Color color;
    public Shape(int[][] coords, Board board, Color color) {
        this.coords = coords;
        this.board=board;
        this.color=color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void reset(){
        x=4;
        y=0;
        coolision=false;
    }

    public void update(){
        if (coolision) {
            for (int row=0; row<coords.length; row++){
            for (int col=0; col<coords[0].length;col++){
                if(coords[row][col]!=0){
                     board.getBoard()[y+row][x+col]=color;
                }
            }
            }
            //set current Shape
            board.setCurrentShape();
            return;}
        boolean moveX=true;
        //Check movement horizontal
        if (!(x+deltaX+coords[0].length>10)&&!(x+deltaX<0)){
            for (int row=0; row<coords.length; row++) {
                for (int col = 0; col < coords[row].length; col++) {
                    if (coords[row][col] != 0) {
                        if (board.getBoard()[y + row][x + deltaX + col] != null) {
                            moveX = false;
                        }
                    }
                }
            }
            if (moveX){
            x+=deltaX;}}deltaX=0;
        //Check movement vertical
        if (System.currentTimeMillis()-beginTime>delayTimeForMovement){
            if (!(y+1+coords.length>boardHeight)){
        //điều kiện để 2 khối trồng lên nhau
                for (int row=0; row<coords.length; row++){
                    for (int col=0; col<coords[row].length;col++){
                        if (coords[row][col]!=0){
                            if (board.getBoard()[y+1+row][x+deltaX+col]!=null){
                                coolision=true;
                            }
                        }
                    }
                }
                if (!coolision){
                y++;}
            }else {coolision=true;}
            beginTime=System.currentTimeMillis();
        }
    }
    public void render(Graphics g){
        //Draw the shape
        for (int row=0;row<coords.length;row++){
            for (int col=0;col<coords[0].length;col++){
                if (coords[row][col]!=0) {
                    g.setColor(color);
                    g.fillRect(col * blockSide+x*blockSide, row * blockSide+y*blockSide, blockSide, blockSide);
                }}
        }
    }
    public void speedUp(){
        delayTimeForMovement=fast;
    }
    public void speedDown(){
        delayTimeForMovement=normal;
    }
    public void moveLeft(){
        deltaX=-1;
    }
    public void moveRight(){
        deltaX=1;
    }
}
