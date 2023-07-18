import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chessboard{
    //Settings
    private ChessPiece[][]board;
    private List<ChessPiece> whitePieces;
    private List<ChessPiece> blackPieces;
    public Chessboard(){
        board = new ChessPiece[8][8];
        resetBoard();
        refreshBoard();
    }

    private void resetBoard(){
        /*
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

         */
        whitePieces = new ArrayList<>();
        blackPieces = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            whitePieces.add(new Pawn(0, this, 6, i));
            //whitePieces[i] = new Pawn(0, this, 6, i);
            //board[6][i] = whitePawns[i];
            //blackPieces[i] = new Pawn(1, this, 1, i);
            blackPieces.add(new Pawn(1, this, 1, i));
            //board[1][i] = blackPawns[i];
        }
    }

    public void refreshBoard(){
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], null);
        }

        for (int i = 0; i < whitePieces.size(); i++) {
            ChessPiece cp = whitePieces.get(i);
            board[cp.getRow()][cp.getcol()] = cp;
        }

        for (int i = 0; i < blackPieces.size(); i++) {
            ChessPiece cp = blackPieces.get(i);
            board[cp.getRow()][cp.getcol()] = cp;
        }
    }

    public ChessPiece getPiece(int color, int col, int row){
        if (color == 0){
            for (ChessPiece cp :whitePieces) {
                if (cp.getcol() == col && cp.getRow() == row) return cp;
            }
        }else {
            for (ChessPiece cp :blackPieces) {
                if (cp.getcol() == col && cp.getRow() == row) return cp;
            }
        }
        return null;
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
