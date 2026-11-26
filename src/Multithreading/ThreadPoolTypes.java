package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTypes {
    public static void main(String[] args) {
        Runnable run1 = ()->{
            for(int i=1;i<6;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };
        Runnable run2 = ()->{
            for(int i=7;i<11;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };
        Runnable run3 = ()->{
            for(int i=20;i<31;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };
        Runnable run4 = ()->{
            for(int i=40;i<51;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };
        Runnable run5 = ()->{
            for(int i=60;i<71;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };
        Runnable run6 = ()->{
            for(int i=80;i<91;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };

       // ExecutorService ex2 = Executors.newCachedThreadPool();
        ExecutorService ex2 = Executors.newSingleThreadExecutor();
        ex2.execute(run1);
        ex2.execute(run2);
        ex2.execute(run3);
        ex2.execute(run4);
        ex2.execute(run5);
        ex2.execute(run6);
        ex2.shutdown();
    }
}
