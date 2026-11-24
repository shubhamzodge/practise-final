package Multithreading;

public class MethodLevelSynchronisation {
    public static void main(String[] args) {
        Library L1 = new Library();

        Thread t1 = new Thread(()->{
            L1.display();
        });

        Thread t2 = new Thread(()->{
            L1.display();
        });

        t1.start();
        t2.start();
    }

}
class Library{
    public synchronized void display(){
        System.out.println(Thread.currentThread().getName());
    }
}
