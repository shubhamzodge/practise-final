package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.Collectors;

//Find numbers starting with digit 1
public class StartingWithDigit {
    public static void main(String [] args){

        List<Integer> list = List.of(11,23,5,101,67,89,34,22,90)

        .stream()
                .filter((t)->{
                    return String.valueOf(t).startsWith("1");
                })
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
