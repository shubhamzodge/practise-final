//each element in array occurs twice one element occurs once find it
public class FindSingleElement {
    public static int findSingle(int [] arr){
        int ans = 0;
        for(int num :arr){
            ans ^= num;
        }
        return ans;
    }
    public static void main(String [] args){
        int [] arr ={4,1,2,1,2};
        int result = findSingle(arr);
        System.out.println("single element among array is: "+result);
    }
}
//xor:same operator :zero && opposite operator : that element