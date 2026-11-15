package StreamApiFreqentlyAsked;

import java.util.List;

//Check whether all numbers are positive
public class Check {
    public static void main(String[] args) {
        List<Integer> list= List.of(11,23,4,56,7,89,80);
        boolean result= list
                .stream()
                .allMatch((t)->{
                    return t>0;
                });
        System.out.println(result);
    }
}
