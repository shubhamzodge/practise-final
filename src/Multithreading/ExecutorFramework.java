package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        Runnable run = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        };
        Runnable run2 =()->{
            for(int i=31;i<=40;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        };

        Runnable run3 =()->{
            for(int i=11;i<=20;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        };
        //executor means thread pool
        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.execute(run);
        ex.execute(run2);
        ex.shutdown();
    }
}
