import javax.swing.*;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {

    public static void main(String[] args) {
        Chessboard board = new Chessboard();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(board);
        int color = 0;

        while (running){
            System.out.println("Select Piece:");
            String input = scanner.nextLine();
            if (input.equals("!Q")){
                running = false;
                System.out.println("Game aborted!");
            }

            if (!Pattern.matches("^[a-hA-H][1-8]$", input)){
                System.err.println("Invalid coordinates. Try Again!");
                continue;
            }

            ChessPiece selected = board.getPiece(color,Character.getNumericValue(input.charAt(1))-1 , ((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'));
            if (selected == null){
                System.err.println("No Pieces Found/ You chose the Piece with the wrong color. Please try again!");
                continue;
            }


            System.out.println("Move to:");
            input = scanner.nextLine();
            while (!Pattern.matches("^[a-hA-H][1-8]$", input)){
                System.err.println("Invalid coordinates. Try Again!");
                System.out.println("Move to:");
                input = scanner.nextLine();
            }
            ChessPiece s1 = board.getPiece(color,Character.getNumericValue(input.charAt(1))-1 , ((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'));
            ChessPiece s2 = board.getPiece((color+1)%2,Character.getNumericValue(input.charAt(1))-1 , ((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'));
            while (s1 != null){
                System.err.println("Your own pieces are blocking the Way!");
                System.out.println("Move to:");
                input = scanner.nextLine();
                s1 = board.getPiece(color,Character.getNumericValue(input.charAt(1))-1 , ((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'));
                s2 = board.getPiece((color+1)%2,Character.getNumericValue(input.charAt(1))-1 , ((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'));
            }
            if (s2 == null){
                try {
                    selected.move(((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'), Character.getNumericValue(input.charAt(1))-1);
                    color = (color+1)%2;
                    System.out.println(color);
                }catch (IllegalMoveException e) {
                    System.err.println(e);
                }
            }else {
                selected.take(((Character.isLowerCase(input.charAt(0)))? input.charAt(0)-'a': input.charAt(0)-'A'), Character.getNumericValue(input.charAt(1))-1);
                color = (color+1)%2;
            }

            System.out.println(board);
        }
    }
}