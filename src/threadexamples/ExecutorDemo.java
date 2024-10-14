package threadexamples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ExecutorThread1 implements Runnable{
    int value=0;
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("number "+value+i);
        }
    }
}

class ExecutorThread2 implements Runnable{
    int value=0;
    @Override
    public void run(){
        for(int i=100;i>=0;i--){
            System.out.println("number "+value+i);
        }
    }
}
public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        long startedTime = System.currentTimeMillis();
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        ExecutorService executor=  Executors.newWorkStealingPool();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        executor.schedule(()->{
            System.out.println("hai");
        },2,TimeUnit.SECONDS);
        Runnable runnable1=new ExecutorThread1();
        Runnable runnable2=new ExecutorThread2();
        executor.submit(runnable1);
        executor.submit(runnable2);
        executor.shutdown();
        // Wait until all threads finish execution or timeout after 1 minute
        executor.awaitTermination(5, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTime - startedTime) + " ms");
    }
}
