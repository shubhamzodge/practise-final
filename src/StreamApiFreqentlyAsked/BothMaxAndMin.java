package StreamApiFreqentlyAsked;

import java.util.Comparator;
import java.util.List;

public class BothMaxAndMin {
    public static void main(String [] args) throws Exception{
        List<Integer>list= List.of();

//        int max= list.stream()
//                .max(Comparator.naturalOrder())
//                .orElseThrow();

        int min = list.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(()->{return new Exception("element nahi re baba");});
       // System.out.println("Maximum number: "+ max);
        System.out.println("Minimum number: "+min);
    }
}
