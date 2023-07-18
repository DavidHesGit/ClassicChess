public class Pawn implements ChessPiece{
    private int color; //0 = White, 1 = Black
    private final String name = "P";
    private final int value = 1;

    @Override
    public String toString() {
        return ((color == 0)? "W": "B") + name;
    }

    public Pawn(int color) {
        this.color = color;
    }

    @Override
    public void move() {

    }

    @Override
    public void take() {

    }
}
