package StreamApiFreqentlyAsked;

import java.util.List;

public class Even {
    public static void main(String [] args){
        List<Integer>list = List.of(11,23,5,67,89,34,22,90);

        list.stream()
                .filter((t)->{
                    return t%2==0;
                })
                //.forEach(System.out::println);
                .forEach((t)->{
                    System.out.println(t);
                });

    }
}
