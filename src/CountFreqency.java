import java.util.HashMap;

public class CountFreqency {
    public static void main(String [] args){
        int [] arr = {1,3,3,4,4,6,8,8,8,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
