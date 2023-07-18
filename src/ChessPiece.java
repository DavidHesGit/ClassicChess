public interface ChessPiece {
    void move(int row, int col);
    void take(int row, int col);

    int getRow();
    int getcol();

}
