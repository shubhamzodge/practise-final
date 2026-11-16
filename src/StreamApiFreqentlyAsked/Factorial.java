package StreamApiFreqentlyAsked;
//factorial of given numbers in list
import java.util.List;

public class Factorial {
    public static void main(String [] args){
        List<Integer>list = List.of(11,7,9,3);
        list.stream()
                .map((t)->{
                    int fact =1;
                    for(int i=1;i<=t;i++){
                        fact *=i;

                    }
                    return fact;
                })
                .forEach((j)->{
                    System.out.println(j);
                });
    }
}
