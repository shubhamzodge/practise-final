package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.Collectors;

//Skip the first 3 elements and return the rest
public class SkipSome {
    public static void main(String[] args) {
        List<Integer> list= List.of(11,23,4,56,7,89,80)
        .stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
