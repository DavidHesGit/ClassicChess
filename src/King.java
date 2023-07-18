public class King implements ChessPiece{
    private int color; //0 = White, 1 = Black
    private final String name = "K";

    @Override
    public String toString() {
        return ((color == 0)? "W": "B") + name;
    }

    public King(int color) {
        this.color = color;
    }

    @Override
    public void move() {

    }

    @Override
    public void take() {

    }
}
