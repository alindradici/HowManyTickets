import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        int match = 0;
        int counter = 0;

        final List<Integer> Lotto = new genNumbers().numberGenerator();
        List<Integer> myNums;

        do {
            counter++;
           myNums = new genNumbers().numberGenerator();
            for (int x : Lotto) {
                if (myNums.contains(x)) {
                    match++;
                }
            }

        } while (match != 3);


    }
}
