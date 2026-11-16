package StreamApiFreqentlyAsked;
//Find the maximum and minimum number
import java.util.List;

public class Maximum {
    public static void main(String [] args){
        List<Integer> list = List.of(11,23,55,90,8,4,2);

        list.stream()
                .distinct()
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })

                .limit(1)
                .forEach(System.out::println);
    }
}
