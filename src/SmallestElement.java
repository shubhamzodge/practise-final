public class SmallestElement {
    public static int findSmallest(int [] arr){
        int smallest = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest= arr[i];
            }
        }
        return smallest;
    }
    public static void main(String [] args){
        int [] arr ={7,8,5,3,9,1,0};
        System.out.println(findSmallest(arr));
    }
}
