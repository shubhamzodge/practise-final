package Multithreading;
//if i not used synchronized it will give me inconsistent result

public class SynchronousExectionOFThread {
    public static void main(String[] args) {

        Theater obj  = new Theater();
//        t1.bookSeats("Montya",5);
//        t1.bookSeats("Kali",8);
        Thread M1 = new Thread(()->{
            obj.bookSeats("Alisha",5);
        });
        Thread M2 = new Thread(()->{
            obj.bookSeats("Nita",10);
        });
        Thread M3 = new Thread(()->{
            obj.bookSeats("Pappu",8);
        });
        M1.start();
        M2.start();
        M3.start();

    }
}
class Theater{
    int seats =16;
    public synchronized  void bookSeats(String str,int num){
        System.out.println("User arrived: "+str +"wants to book: "+ num);
        if(seats>num){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("seats are avaliable you can do booking: ");
            this.seats = this.seats- num;
            System.out.println("User: "+str+"booked seats: "+ num);
            System.out.println("Available seats are: "+ this.seats);
        }
        else{
            System.out.println("seats are not enough");
        }
    }
}
