import javax.swing.*;
import java.awt.*;

public class Chessboard extends JPanel implements Runnable {
    //Settings

    private int originalTileSize = 16; // 16x16, Basic size of any ponents in the game
    private int scale = 3;

    private int tileSize = originalTileSize * scale; // 48 * 48
    private int maxScreenCol = 10;
    private int maxScreenRow = 10;

    private int screenWidth = tileSize * maxScreenCol;
    private int screenHeight = tileSize * maxScreenRow;

    Thread gameThread;

    public Chessboard(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); // Improves Renderperformance

    }

    public void start(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null){
            System.out.println("Running");
        }
    }
}
