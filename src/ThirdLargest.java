public class ThirdLargest {
    public static int findThirdLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        if(arr== null ||arr.length<3){
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                thirdLargest = secLargest;
                secLargest= largest;
                largest= arr[i];
            }
            else if(arr[i]>secLargest && arr[i]<largest){
                thirdLargest = secLargest;
                secLargest = arr[i];

            }
            else if(arr[i]>thirdLargest && arr[i]<secLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }
    public static void main(String [] args){
        int [] arr ={1,2,3,4,5,6,7,8};
        System.out.println("third largest element in an array "+ findThirdLargest(arr));
    }
}
