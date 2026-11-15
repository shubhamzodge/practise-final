package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.Collectors;

public class Descending {
    public static void main(String[] args) {
        List<Integer> list= List.of(11,23,4,56,7,89,80)
                .stream()
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
