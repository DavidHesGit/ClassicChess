import javax.swing.*;
import java.util.Scanner;
import java.util.SortedMap;

public class Game {

    public static void main(String[] args) {
        Chessboard board = new Chessboard();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(board);

        while (running){
            String input = scanner.nextLine();
            System.out.println(board);
            if (input.equals("!Q")){
                running = false;
                System.out.println("Game aborted!");
            }
        }
    }
}