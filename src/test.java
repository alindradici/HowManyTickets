import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin on 5/17/2016.
 */
public class test {
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public static void main (String [] args){

        new test().num();

    }
    public void num(){
        int counter=0;

        list.add(12);
        list.add(1);
        list.add(3);

        list2.add(3);
        list2.add(1);
        list2.add(2);

        for(int i=0;i<list.size();i++){
            if(list.contains(list2.get(i))){
                counter++;
            }
        }
        System.out.println(counter);
    }

}
