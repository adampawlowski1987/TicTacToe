import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> playerPositions = new ArrayList<>();
    public static ArrayList<Integer> computerPositions = new ArrayList<>();
    public static void main(String[] args) {



        while (true) {

//            Board.drawBoard();
            Board.addPosition(Board.board, playerPositions);
            Board.addPosition(Board.board, computerPositions);
            WinnerChecker.checkWinner(playerPositions);
            WinnerChecker.checkWinner(computerPositions);

            System.out.println(playerPositions);
        }

    }
}
