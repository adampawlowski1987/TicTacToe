import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerChecker {

    public static void checkWinner(ArrayList<Integer> userPosition) {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List firstDiagonal = Arrays.asList(1, 5, 9);
        List secondDiagonal = Arrays.asList(3, 5, 7);

        List<List> fullList = new ArrayList<List>();
        fullList.add(topRow);
        fullList.add(midRow);
        fullList.add(botRow);
        fullList.add(leftCol);
        fullList.add(midCol);
        fullList.add(rightCol);
        fullList.add(firstDiagonal);
        fullList.add(secondDiagonal);

        for (List i : fullList) {
            if (userPosition.containsAll(i)) {
                System.out.println("wygrałeś");
            } else {
                System.out.print("");
            }

        }
    }
}



