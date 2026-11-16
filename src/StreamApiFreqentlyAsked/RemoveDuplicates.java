package StreamApiFreqentlyAsked;
//Remove duplicate elements from a list
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list= List.of(11,23,4,56,7,89,4,23,11,80)
        .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
