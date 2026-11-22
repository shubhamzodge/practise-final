package ExceptionHandling;

public class Exception1{
    public static void main(String[] args) {
        int age =19;
        try{
            if(age<18){
                throw new InvalidAgeException("You are not eligible for voting");
            }
            System.out.println("You can do voting");
        }
        catch (InvalidAgeException ex){
            ex.printStackTrace();
        }
        System.out.println("End of voting system");

    }
    static class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
    }
}