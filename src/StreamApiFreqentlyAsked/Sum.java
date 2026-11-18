package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.IntStream;

//Find the sum of all numbers
public class Sum {
    public static void main(String [] args){
        List<Integer>list = List.of(1,2,3);

       int sum = list.stream()
               .mapToInt(Integer::intValue)
               .sum();
       System.out.println(sum);


    }
}
