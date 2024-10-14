package threadexamples.synchronization;

public class ProducerThread implements Runnable{
    private final SharedResource sharedResource;
    public ProducerThread(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        while (true){
            try {
                sharedResource.produce();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
