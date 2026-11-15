package StreamApiFreqentlyAsked;

import java.util.List;

//Count strings whose length is greater than 5
public class CountGreater {
    public static void main(String[] args) {
        List<String>list = List.of("Ramgopal","verma","Tilak","om","raj");
        list.stream()
                .filter((t)->{
                    return t.length()>5;
                })
                .forEach(System.out::println);
    }
}
