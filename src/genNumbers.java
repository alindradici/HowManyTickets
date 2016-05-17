import java.util.*;

/**
 * Created by alin on 5/16/2016.
 */
public class genNumbers {

    public List numberGenerator() {
        // 1 prepare the lotto machine and init it
       List<Integer> list = new ArrayList<>();
        Random lottoMachine = new Random();
        lottoMachine.setSeed(System.currentTimeMillis());
// 2 generate the lotto numbers
        Set setofSix = null;
        setofSix = new HashSet<Integer>();
        int counter = 0;
        do {
            int nr = lottoMachine.nextInt(49) + 1;
            boolean success = setofSix.add(nr);
            if (success) { // nr not already in the set
                list.add(nr);
                counter++;
            }
        }

        while (counter < 6);
        return list;

    }

}