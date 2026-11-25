package Multithreading;

public class BookMyShow {
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        Thread th11 = new Thread(()->{
            try {
                m1.bookSeats("montya",30);
            } catch (SeatNotAvailableEx e) {
                System.out.println(e.getMessage());
            }
        });
        Thread th12 = new Thread(()->{
            try {
                m1.bookSeats("Kalu",25);
            } catch (SeatNotAvailableEx e) {
                System.out.println(e.getMessage());
            }
        });
        Thread th13 = new Thread(()->{
            try {
                m1.bookSeats("Vento",5);
            } catch (SeatNotAvailableEx e) {
                System.out.println(e.getMessage());
            }
        });
        th11.start();
        th12.start();
        th13.start();
    }
}
class MovieTicket{
    int seats = 50;
    public synchronized void bookSeats(String name,int num) throws SeatNotAvailableEx {
        System.out.println(name +" Arrived "+ "Wants to book "+num);
        if(num>seats){
            throw new SeatNotAvailableEx("sorry "+name +" seats are not available");
        }
        //we have give some time to user for booking
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seats = seats- num;
        System.out.println(name + " successfully booked "+ num + " tickets");
        System.out.println("Remainning seats are "+seats);
        System.out.println("--------------------------");

    }
}
class SeatNotAvailableEx extends Exception{
    public SeatNotAvailableEx(String message){
        super(message);
    }
}
