import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    public static ArrayList<Integer> computerPositions = new ArrayList<Integer>();
    public static void main(String[] args) {

        Board.drawBoard();

        while (true) {
            Board.addPosition(Board.board, playerPositions);
            Board.addPosition(Board.board, computerPositions);
            Board.drawBoard();
            WinnerChecker.checkWinner(playerPositions);
            WinnerChecker.checkWinner(computerPositions);
        }

    }
}
