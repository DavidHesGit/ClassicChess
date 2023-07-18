import javax.swing.*;
import java.awt.*;

public class Chessboard{
    //Settings
    private ChessPiece[][]board;
    public Chessboard(){
        board = new ChessPiece[8][8];
        resetBoard();
    }

    private void resetBoard(){
        board[0][0] = new Rook(1);
        board[0][1] = new Knight(1);
        board[0][2] = new Bishop(1);
        board[0][3] = new Queen(1);
        board[0][4] = new King(1);
        board[0][5] = new Bishop(1);
        board[0][6] = new Knight(1);
        board[0][7] = new Rook(1);

        board[7][0] = new Rook(0);
        board[7][1] = new Knight(0);
        board[7][2] = new Bishop(0);
        board[7][3] = new Queen(0);
        board[7][4] = new King(0);
        board[7][5] = new Bishop(0);
        board[7][6] = new Knight(0);
        board[7][7] = new Rook(0);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(1);
            board[6][i] = new Pawn(0);
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
