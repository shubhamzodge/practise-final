package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to uppercase
public class Upper {
    public static void main(String[] args) {
        List<String>list = List.of("motu","patlu","shamu");

        List<String>result=list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
