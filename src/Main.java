import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int match=0;
        int counter =0;

        do {
            counter++;
            List<Integer> lottery = new ArrayList<>(new genNumbers().numberGenerator());
            List<Integer> myTicket = new ArrayList<>(new genNumbers().numberGenerator());

            for (int x : lottery) {
                if (myTicket.contains(x)) {
                    match++;
                }
            }
        }while( match !=3  );
        System.out.println(match);
}
}
