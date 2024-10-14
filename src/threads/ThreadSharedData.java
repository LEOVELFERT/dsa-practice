package threads;

public class ThreadSharedData {
    private int data;
    private boolean produced=false;

    public synchronized void produce(int value) throws InterruptedException {
        while(produced){
            wait();
        }
        data=value;
        produced=true;
        System.out.println("the data is produced -----date"+data);
        notify();
    }
    public synchronized void consume(int value) throws InterruptedException {
        while(!produced){
            wait();
        }
        produced=false;
        System.out.println("the data is consumed -----date"+data);
        notify();
    }
}
