package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.Collectors;

//Return the first 5 elements
public class Limiting {
    public static void main(String[] args) {
        List<Integer> list= List.of(11,23,4,56,7,89,80)
                .stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
