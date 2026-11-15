package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Conversion of list into set
public class ConversionIntoset {
    public static void main(String[] args) {
        List<Integer> list= List.of(11,23,4,4,56,7,89,80);

        Set<Integer>result = list.stream()
                .collect(Collectors.toSet());
        System.out.println(result);
    }

}
