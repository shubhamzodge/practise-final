import java.util.HashSet;

public class Intersection {
    public static int [] findCommon(int [] arr1,int [] arr2){
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>resultSet = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }
        int [] output= new int [resultSet.size()];
        int index =0;
        for(int ans:resultSet){
            output[index++]= ans;
        }
        return output;


    }
    public static void main(String [] args){
        int [] arr1={1,2,3,4,5};
        int [] arr2={4,5,6,7};

        int []getResult = findCommon(arr1,arr2);
        for(int i=0;i< getResult.length;i++){
            System.out.print(getResult[i]+" ");
        }

    }
}
