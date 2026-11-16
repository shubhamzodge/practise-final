package StreamApiFreqentlyAsked;

import java.util.Comparator;
import java.util.List;

//Find the longest string in a list
public class LongestString {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "SpringBoot", "SQL", "Microservices");

        String longest= words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longest);
    }
}
