package StreamApiFreqentlyAsked;

import java.util.List;

//Find the average of numbers
public class Average {
    public static void main(String[] args) {
       List<Integer>list = List.of(1,2,3,4,5);

       double average = list.stream()
               .mapToInt(Integer::intValue)
               .average()
               .orElse(0.0);
        System.out.println(average);

    }
}
