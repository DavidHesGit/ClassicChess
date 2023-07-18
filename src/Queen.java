public class Queen implements ChessPiece{

    private int color; //0 = White, 1 = Black
    private final String name = "Q";
    private final int value = 9;

    @Override
    public String toString() {
        return ((color == 0)? "W": "B") + name;
    }

    public Queen(int color) {
        this.color = color;
    }

    @Override
    public void move() {

    }

    @Override
    public void take() {

    }
}