package StreamApiFreqentlyAsked;

import java.util.List;
import java.util.stream.Collectors;
//Join strings with commas
public class Joinning {
    public static void main(String[] args) {
        String str = List.of("Ram","Raju","Gopal","dinesh")
                .stream()
                .collect(Collectors.joining(","));
        System.out.println(str);
    }
}
