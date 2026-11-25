package Multithreading;
//try me taking synchronised and without it
// without synchronised it will get negative output

public class TicketBookingSystem {
    public static void main(String[] args) {
        BusTickets b1 = new BusTickets();

        Thread th1 = new Thread(()->{

            try {
                b1.bookSeats("Alisha",19);
            } catch (seatNotAvailableException e) {
                System.out.println(e.getMessage());
            }

        });

        Thread th2 = new Thread(()->{

            try {
                b1.bookSeats("Shubham",8);
            } catch (seatNotAvailableException e) {
                System.out.println(e.getMessage());
            }


        });

        Thread th3 = new Thread(()->{

            try {
                b1.bookSeats("Bunti",19);
            } catch (seatNotAvailableException e) {
                System.out.println(e.getMessage());
            }

        });
              th1.start();
              th2.start();
              th3.start();

    }
}
class BusTickets {
    int seats = 30;

    public synchronized void bookSeats(String name, int num) throws seatNotAvailableException {
        System.out.println(name + " Wants to book " + num + " seats");

        if (num > seats) {
            throw new seatNotAvailableException("Sorry " + name + " ,seats are not available");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seats = seats - num;
        System.out.println(name + " successfully booked " + num + " seats");

        System.out.println("Remainning seats: " + seats);
        System.out.println("----------------------------");

    }
}
    class seatNotAvailableException extends Exception{
        public seatNotAvailableException(String message){
            super(message);
        }
    }


