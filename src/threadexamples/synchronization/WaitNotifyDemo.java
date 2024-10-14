package threadexamples.synchronization;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource(5);
        Runnable producerRunnable=new ProducerThread(sharedResource);
        Runnable consumerRunnable=new ConsumerThread(sharedResource);
        Thread producerThread=new Thread(producerRunnable);
        Thread consumerThread=new Thread(consumerRunnable);
        producerThread.start();
        consumerThread.start();
    }
}
