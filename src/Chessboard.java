import javax.swing.*;
import java.awt.*;

public class Chessboard{
    //Settings
    private String[][]board;
    public Chessboard(){
        board = new String[8][8];
        resetBoard();
    }

    private void resetBoard(){
        board[0][0] = "BR";
        board[0][1] = "BN";
        board[0][2] = "BB";
        board[0][3] = "BQ";
        board[0][4] = "BK";
        board[0][5] = "BB";
        board[0][6] = "BN";
        board[0][7] = "BR";

        board[7][0] = "WR";
        board[7][1] = "WN";
        board[7][2] = "WB";
        board[7][3] = "WQ";
        board[7][4] = "WK";
        board[7][5] = "WB";
        board[7][6] = "WN";
        board[7][7] = "WR";

        for (int i = 0; i < 8; i++) {
            board[1][i] = "BP";
            board[6][i] = "WP";
        }


    }

    @Override
    public String toString() {
        StringBuilder currentBoard = new StringBuilder();

        for (int col = 0, ch = 'A'; col < board.length; col++, ch++) {
            currentBoard.append((char)ch).append(" ");
            for (int row = 0; row < board[0].length; row++) {
                if (board[col][row] == null){
                    currentBoard.append(" . ");
                }else {
                    currentBoard.append(board[col][row]).append(" ");
                }
            }
            currentBoard.append("\n");
        }

        currentBoard.append("  ");
        for (int i = 1; i <= 8; i++) {
            currentBoard.append(String.format(" %d ", i));
        }

        
        return currentBoard.toString();
    }
}
