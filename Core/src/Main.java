import java.util.Random;
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




        Player player1 = new Player( "Gracz pierwszy");
        Player player2 = new Player("Gracz drugi");
        Player player = player1;

        char symbol;
        char cross = '\u274c';
        char circle= '\u2b24';
        int pos;
        Random random = new Random();



do {



    if (player.equals(player1)){ symbol = cross;
        System.out.println("Wybierz polę, w którym zamierzasz umieścić symbol");
        pos= scanner.nextInt();
    }

    else { symbol = circle;
        pos = random.nextInt(9);

    }
do {
    switch (pos) {
        case 1:
            gameBoard[0][0] = symbol;
            break;
        case 2:
            gameBoard[0][2] = symbol;
            break;
        case 3:
            gameBoard[0][4] = symbol;
            break;
        case 4:
            gameBoard[2][0] = symbol;
            break;
        case 5:
            gameBoard[2][2] = symbol;
            break;
        case 6:
            gameBoard[2][4] = symbol;
            break;
        case 7:
            gameBoard[4][0] = symbol;
            break;
        case 8:
            gameBoard[4][2] = symbol;
            break;
        case 9:
            gameBoard[4][4] = symbol;
            break;
    } while (gameBoard. != cross || circle);
    }


    if (player == player1) {player = player2;
    }
    else {player = player1;
        Board.pirntGameBoard(gameBoard);}


} while (true);
    }

}
