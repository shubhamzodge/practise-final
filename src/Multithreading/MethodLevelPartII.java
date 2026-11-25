package Multithreading;

public class MethodLevelPartII {
    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        Thread t1 = new Thread(()->{
            b1.add();
        });
        Thread t2 = new Thread(()->{
            b1.add();
        });
        t1.start();
        t2.start();

    }
}
class Bottle{
    int counter =0;
    public synchronized void add(){
        try {
            System.out.println(Thread.currentThread().getName()+" Entered");
            Thread.sleep(1000);
            counter++;
            System.out.println(Thread.currentThread().getName()+":"+counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
