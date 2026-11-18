package StreamApiFreqentlyAsked;

import java.util.List;

//Convert a list of strings to uppercase
public class Uppercase {
    public static void main(String [] args){
        List<String>list = List.of("Ram","Raju","Gopal","dinesh");

        list.stream()
                .map((t)->{
                    return t.toUpperCase();
                })
                .forEach(System.out::println);
    }
}
