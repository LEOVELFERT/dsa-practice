package threadexamples.synchronization;

public class ConsumerThread implements Runnable{
    private final SharedResource sharedResource;
    public ConsumerThread(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        while (true){
            try {
                sharedResource.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
