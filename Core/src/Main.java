import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] gameBoard = {{'1', '|', '2', '|', '3'},
                {'-', '+', '-', '+', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '+', '-', '+', '-'},
                {'7', '|', '8', '|', '9'}};

        Scanner scanner = new Scanner(System.in);
        Board.pirntGameBoard(gameBoard);

        System.out.println("Wpisz numer pola, w którym chcesz wpisać kółko albo krzyżyk ");
        int pos= scanner.nextInt();

        char cross = '\u274c';
        char circle= '\u25ef';




        switch (pos){
            case 1:
                gameBoard[0][0] = cross;
                break;
            case 2:
                gameBoard[0][2] = cross ;
                break;
            case 3:
                gameBoard[0][4] = cross;
                break;
            case 4:
                gameBoard[2][0] = cross;
                break;
            case 5:
                gameBoard[2][2] = cross;
                break;
            case 6:
                gameBoard[2][4] = cross;
                break;
            case 7:
                gameBoard[4][0] = cross;
                break;
            case 8:
                gameBoard[4][2] = cross;
                break;
            case 9:
                gameBoard[4][4] = cross;
                break;
        }
        Board.pirntGameBoard(gameBoard);

    }

}
