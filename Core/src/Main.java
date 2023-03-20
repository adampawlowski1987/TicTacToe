import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> userPositions = new ArrayList<Integer>();

//        userPositions = Arrays.stream(Board.board).toArray();

        Board.drawBoard();

        while (true) {
            Board.addPosition(Board.board);
            Board.drawBoard();
        }

    }
}
