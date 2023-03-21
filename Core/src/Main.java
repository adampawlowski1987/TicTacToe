import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> playerPositions = new ArrayList<>();
    public static ArrayList<Integer> computerPositions = new ArrayList<>();
    public static void main(String[] args) {

        Board.drawBoard();

        while (true) {


            Board.addPosition(Board.board);
            Board.addPosition(Board.board);
            WinnerChecker.checkWinner(playerPositions);
            WinnerChecker.checkWinner(computerPositions);
            Board.drawBoard();


//            System.out.println("gracz" + playerPositions);
//            System.out.println("komputer" + computerPositions);
        }

    }
}
