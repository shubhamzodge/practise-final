public class ArmstrongNumberFrom1toN {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int num =i;
            int original =num;
            int sum =0;
            int digits = String.valueOf(num).length();    //length find

            while(num>0){
                int digit = num%10;
                sum += (int) Math.pow(digit,digits);
                num/=10;
            }
            if(sum == original){
                System.out.print(original+ " ");
            }
        }
    }
}