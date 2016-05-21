import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        long match;
        int counter = 0;

        final List<Integer> myTicket = new myGenerator().numGen();

        do{
            List <Integer> list = new myGenerator().numGen();
            match = 0;
            counter++;
            for(int i=0;i<myTicket.size();i++){
                if(list.contains(myTicket.get(i))){
                    match++;
                }
            }
        }while(match!=6);

        System.out.println(match);
        System.out.println("you need "+counter+" tickets to win with " + match + " numbers");


    }
}


