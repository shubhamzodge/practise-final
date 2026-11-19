public class MissingNumber {
    public static int findMissingNumber(int [] arr){
        int n= arr.length;

        int totalSum = n*(n+1)/2;
        int numSum = 0;

        for(int i=0;i<n;i++){
            numSum += arr[i];
        }
        int missingSum = totalSum-numSum;
        return missingSum;
    }
    public static void main(String [] args){
        int [] arr ={1,2,0,4};
        System.out.println(findMissingNumber(arr));
    }
}
