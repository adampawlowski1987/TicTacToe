import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {

    public static int position = 0;
    public static int playerPosition = 0;
    public static int computerPosition;

   public static char cross = '\u274C';
    public static char circle = '\u2b24';

    public static char symbol = circle;
    public static char[][] board = {sss

            //test

            {'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}};

    public static void drawBoard() {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void addPosition(char[][] board) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        if (symbol == circle) {
            System.out.println("Podaj numer pozycji, w której chcesz wpisać symbol");
            position = scanner.nextInt();
            Main.playerPositions.add(position);
            symbol = circle;

        } else {
            position = random.nextInt(8) + 1;
            Main.computerPositions.add(position);
            symbol = cross;

        }

        switch (position) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                break;
        }
        if (symbol== cross) {
            symbol = circle;
        } else {
            symbol = cross;
        }
//        System.out.println("Komputer" + Main.computerPositions);
//        System.out.println(Main.playerPositions);
    }
}


