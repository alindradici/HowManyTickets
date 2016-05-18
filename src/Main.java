import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int counter = 0;
        long match ;


        final List<Integer> myTicket = new myGenerator().numGen();

        do{
            match = 0;
            counter++;
            for(int i=0;i<myTicket.size();i++){
                if(new myGenerator().numGen().contains(myTicket.get(i))){
                    match++;
                }
            }
        }while(match!=6);

        System.out.println(match);
        System.out.println("you need "+counter+" tickets to win with " + match + " numbers");


    }
}


