public class LargestElement {
public static int findLargest(int [] arr){
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}
public static void main(String [] args){
    int [] arr ={2,4,1,6,9,51,7};
    System.out.println(findLargest(arr));
}
}
