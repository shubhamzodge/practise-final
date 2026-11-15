package StreamApiFreqentlyAsked;
//Sort numbers in ascending and descending order
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
    public static void main(String [] args){
        List<Integer> list= List.of(11,23,4,56,7,89,80)

        .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
