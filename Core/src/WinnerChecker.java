import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerChecker {



    public static void checkWinner(ArrayList<Integer> userPosition){
        List topRow = Arrays.asList(1, 2, 3);
        if (userPosition.contains(topRow)){
        System.out.println("wygrałeś");}
else{
            System.out.println("");
        }

    }


}
