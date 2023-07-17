import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setResizable(false);
        game.setTitle("Classic Chess");

        Chessboard board = new Chessboard();
        game.add(board);
        game.pack(); // Reduce window size to the prefered size configured in the Chessboard class

        // Puts it in the center
        game.setLocationRelativeTo(null);
        game.setVisible(true);

        board.start();
    }
}