import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> userPositions = new ArrayList<Integer>();
    public static ArrayList<Integer> computerPositions = new ArrayList<Integer>();
    public static void main(String[] args) {

        Board.drawBoard();

        while (true) {
            Board.addPosition(Board.board, userPositions);
            Board.addPosition(Board.board, computerPositions);
            Board.drawBoard();
            WinnerChecker.checkWinner(userPositions);
            WinnerChecker.checkWinner(computerPositions);
        }

    }
}
