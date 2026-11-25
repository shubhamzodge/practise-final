package Multithreading;
//Block level synchronisation
public class BlockLevelSynchronisation {
    public static void main(String[] args) {
        Aeroplane A1 = new Aeroplane();
        Thread one = new Thread(()->{
            try {
                A1.TicketBook("Sambata",5);
            } catch (AeroTicketNotFoundEx e) {
                System.out.println(e.getMessage());
            }
        });
        Thread two = new Thread(()->{
            try {
                A1.TicketBook("Dido",18);
            } catch (AeroTicketNotFoundEx e) {
                System.out.println(e.getMessage());
            }
        });
        Thread three= new Thread(()->{
            try {
                A1.TicketBook("Gopal",8);
            } catch (AeroTicketNotFoundEx e) {
                throw new RuntimeException(e);
            }
        });
        one.start();
        two.start();
        three.start();


    }
}
class Aeroplane{
    int seats =15;
    public  void TicketBook(String name ,int num) throws AeroTicketNotFoundEx {
        System.out.println(name +"Arrived "+"Wants to book "+ num+" tickets");


        synchronized (this) {
            if (num > seats) {
                throw new AeroTicketNotFoundEx("Sorry " + name + " Tickets are not available");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            seats = seats - num;
            System.out.println(name + " successfully booked " + num + " Tickets");
            System.out.println("remaining seats are " + seats);
            System.out.println("----------------");
        }
    }
}
class AeroTicketNotFoundEx extends Exception{
    public AeroTicketNotFoundEx(String msg){
        super(msg);
    }
}


