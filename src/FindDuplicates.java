import java.util.HashSet;

public class FindDuplicates {
    public static void main(String [] args){
        int [] arr = {4,2,7,2,5,4};

        HashSet<Integer>set = new HashSet<>();
        for(int num:arr){
            if(!set.add(num)){
                System.out.println("Duplicates: "+ num);
            }
        }
    }
}
//  !set.add(num) : "If this number was already in the set..."
// जेव्हा ही condition false होईल तेव्हा element print kar