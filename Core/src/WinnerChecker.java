import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerChecker {



    public static void checkWinner(ArrayList<Integer> userPosition){
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);


        List<List> fullList = new ArrayList<List>();
        fullList.add(topRow);
        fullList.add(midRow);
        fullList.add(botRow);

        if (userPosition.containsAll(fullList))
        for (List i :fullList){
        System.out.println("wygrałeś");}
else{
            System.out.println("");
        }

    }


}
