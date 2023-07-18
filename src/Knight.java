public class Knight implements ChessPiece{
    private int color; //0 = White, 1 = Black
    private final String name = "N";
    private final int value = 3;

    @Override
    public String toString() {
        return ((color == 0)? "W": "B") + name;
    }

    @Override
    public void move() {

    }

    @Override
    public void take() {

    }
}
