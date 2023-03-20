import java.util.Arrays;
import java.util.Scanner;

public class Board {


    public static char[][] board = {

            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

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
        System.out.println("podaj numer pozycji, w której chcesz wpisać symbol");

       int  playerPosition = scanner.nextInt();


       switch (playerPosition){
           case 1:  board[0][0] = 'x'; break;
           case 2:  board[0][2] = 'x'; break;
           case 3:  board[0][4] = 'x'; break;
           case 4:  board[2][0] = 'x'; break;
           case 5:  board[2][2] = 'x'; break;
           case 6:  board[2][4] = 'x'; break;
           case 7:  board[4][0] = 'x'; break;
           case 8:  board[4][2] = 'x'; break;
           case 9:  board[4][4] = 'x'; break;
           default: break;
       }
    }
}


