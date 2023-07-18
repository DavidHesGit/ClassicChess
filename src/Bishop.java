public class Bishop implements ChessPiece{
    private int color; //0 = White, 1 = Black
    private final String name = "B";
    private final int value = 3;

    @Override
    public String toString() {
        return ((color == 0)? "W": "B") + name;
    }

    public Bishop(int color) {
        this.color = color;
    }


    @Override
    public void move(int row, int col) {

    }

    @Override
    public void take(int row, int col) {

    }

    @Override
    public int getRow() {
        return 0;
    }

    @Override
    public int getcol() {
        return 0;
    }
}
