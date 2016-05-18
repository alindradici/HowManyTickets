import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by alin on 5/18/2016.
 */
public class myGenerator {

    public List numGen(){

    List<Integer> list = new ArrayList<>();
    do{
        Random lottoNumbers = new Random();
        int num = lottoNumbers.nextInt(49)+1;
        if(list.contains(num)){

        }
        else{
            list.add(num);
        }
    }while(list.size()<6);

        return list;

    }

 }

