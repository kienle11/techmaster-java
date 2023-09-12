import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Window {
    public static final int width=450, height=635;
    private Board board;
    private JFrame window;
    public Window(){
        window = new JFrame("Tetris Game");
        window.setVisible(true);
        window.setSize(width,height);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        board = new Board();
        window.add(board);
        window.addKeyListener(board);
    }
    public static void main(String[] args) {
      new Window();
        }
    }
