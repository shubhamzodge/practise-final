//check number is armstrong number or not
public class ArmstrongNumber {
    public static void main(String [] args) {
        int num =153;
        int original = num;
        int sum =0;

        int digits = String.valueOf(num).length();
        while(num>0){
            int digit = num%10;
           sum+= (int) Math.pow(digit,digits);
           num/=10;
        }
        if(sum==original){
            System.out.println(original+" is a armstrong number");
        }
    }
}
