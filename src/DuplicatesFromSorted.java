//Rm duplicates from sorted array
public class DuplicatesFromSorted {
    public static int findDuplicates(int [] arr){
        int j=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]!= arr[i-1]){
                arr[j]= arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String [] args){
        int [] arr ={1,2,2,3,4,4,5};
        int newLen = findDuplicates(arr);
        for(int i=0;i<newLen;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
