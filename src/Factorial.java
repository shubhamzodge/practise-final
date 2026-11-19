public class Factorial {
    public static int printFactorial(int num){
        int fact =1;
        for(int i=num;i>=1;i--){
            fact*= i;
        }
        return fact;
    }
    public static void main(String [] args){
        int num =5;
        System.out.println(printFactorial(num));
    }

}
