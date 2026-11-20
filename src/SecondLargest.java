public class SecondLargest {
    public static int findSecondLargest(int [] arr){

        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(arr.length<2 || arr== null){
            throw new IllegalArgumentException("Array must contain more than 2 elements");
        }

        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String [] args){
        int [] arr ={1,6,8,4,9,2,34};
        System.out.println("secondLargest element in an array "+ findSecondLargest(arr));
    }
}
