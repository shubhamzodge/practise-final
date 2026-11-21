import java.util.HashSet;

public class UnionOfTwoArrays {

  public static int [] combineArray(int [] arr1,int [] arr2){
      HashSet<Integer>set = new HashSet<>();
      HashSet<Integer>resultSet = new HashSet<>();

      for(int num:arr1){
          set.add(num);
      }
      for(int num :arr2){
          set.add(num);
      }
      int [] result = new int [set.size()];
      int index =0;
      for(int output:set){
          result[index++] = output;
      }
      return result;


  }
  public static void main(String [] args){
      int [] arr1={1,2,3,4,5,6};
      int [] arr2 ={7,8,9,10};
      int [] answer = combineArray(arr1,arr2);
      for(int num:answer){
          System.out.print(num+" ");
      }
  }
}
