import java.awt.*;

public class Shape {
    private int[][]coords;
    private Board board;
    private int x=4, y=0;
    private int deltaX=0;
    private long beginTime;
    private boolean coolison=false;
    private int normal=600, delayTimeForMovement=normal, fast=50;

    public Shape(int[][] coords, Board board, Color color) {
        this.coords = coords;
        this.board = board;
    }
    public void update(){
    if (coolison){return;}

    //Dieu kien kiem tra khoi gach ko di ra ngoai khi chuyen dong ngang
    if (!(x+deltaX+coords[0].length>Board.boardWidth)&&!(x+deltaX<0)){
        x+=deltaX;} deltaX=0;
    //Điều kiện khối gạch dừng lại khi chạm đáy
    if (System.currentTimeMillis()-beginTime>delayTimeForMovement){
        if (!(y+1+coords.length> Board.boardHeight))
        {y++;}
        else {coolison=true;}
    beginTime=System.currentTimeMillis();}
    }
    public void render(Graphics g){
        for (int i=0; i<coords.length;i++){
            for (int j=0; j<coords[0].length;j++){
                if (coords[i][j]!=0){
                    g.setColor(Color.blue);
                    g.fillRect(j* Board.blockSide+x*Board.blockSide,i*Board.blockSide+y*Board.blockSide,Board.blockSide,Board.blockSide);

                }
            }
        }
    }
    public void goLeft(){
        deltaX=-1;
    }
    public void goRight(){
        deltaX=1;
    }
    public void goDown(){
        delayTimeForMovement=fast;
    }
    public void releaseGoDown(){
        delayTimeForMovement=normal;
    }
}
