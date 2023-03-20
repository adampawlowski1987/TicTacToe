import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> userPositions = new ArrayList<Integer>();
    public static void main(String[] args) {

        Board.drawBoard();

        while (true) {
            Board.addPosition(Board.board);
            Board.drawBoard();
            WinnerChecker.checkWinner(userPositions);
        }

    }
}
