package tetris_puzzle;

import javax.swing.*;

public class WindowGame {
    public static final int width=445, height = 635;
    private JFrame window;
    private Board board;
    public WindowGame(){
        window=new JFrame("Tetris");
        window.setSize(width,height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        board=new Board();
        window.add(board);
        window.addKeyListener(board);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowGame();
    }
}
