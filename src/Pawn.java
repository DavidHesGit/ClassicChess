public class Pawn implements ChessPiece{
    private int color; //0 = White, 1 = Black
    private final String name = "P";
    private final int value = 1;
    private Chessboard chessboard;
    private boolean first = true;

    //Position
    private int row;
    private int col;

    @Override
    public String toString() {
        return ((color == 0)? "W": "B") + name;
    }

    public Pawn(int color, Chessboard chessboard, int row, int col) {
        this.color = color;
        this.chessboard = chessboard;
        this.row = row;
        this.col = col;
    }


    @Override
    public void move(int row, int col) {
        if (color == 0){
            if (col != this.col) throw new IllegalMoveException("Can only move in a straight line");
            if (row > this.row) throw new IllegalMoveException("Cannot move backwards");
            if (this.row - row == 2 && !first) throw new IllegalMoveException("Can only move two tile at the beginning");

            if (this.row - row == 2 && first) this.row = row;
            else if (this.row - row == 1) this.row = row;

            if (this.row - row > 1) throw new IllegalMoveException("You can only move one tile at a time");
        }else if (color == 1){
            if (col != this.col) throw new IllegalMoveException("Can only move in a straight line");
            if (row < this.row) throw new IllegalMoveException("Cannot move backwards");
            if (row - this.row == 2 && !first) throw new IllegalMoveException("Can only move two tile at the beginning");

            if (row - this.row == 2 && first) this.row = row;
            else if (row - this.row == 1) this.row = row;

            if (row - this.row > 1) throw new IllegalMoveException("You can only move one tile at a time");
        }
        chessboard.refreshBoard();
        if (first) first = false;
    }

    @Override
    public void take(int row, int col) {

    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getcol() {
        return col;
    }


}
