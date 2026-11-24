package Multithreading;

import java.util.ArrayList;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        //creation of thread for producer
       Thread pt = new Thread(()->{
           while(true){
               try {
                   sr.producer();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       });
       //creation of thread for consumer
        Thread ct = new Thread(()->{
            while(true) {
                try {
                    sr.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        pt.start();
        ct.start();
    }
}

class SharedResource{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int counter = 1;
    public synchronized void producer() throws InterruptedException {

        while(arr.size()>=10){
            System.out.println("Memory is full and it is entering into waiting stage");
            wait();
        }
        System.out.println("Adding elements");
        arr.add(counter);
        counter++;
        System.out.println("Notifying consumer");
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while(arr.isEmpty()){
            System.out.println("No element is their to remove");
            wait();
        }
        System.out.println("Removing the elements");
        System.out.println(arr.remove(0));

        System.out.println("Notifying producer");
        notify();

    }
}
