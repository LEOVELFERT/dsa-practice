package voltile;

public class voltileDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker worker=new Worker();
        worker.start();
        Thread.sleep(1000);
        worker.stopWorker();
    }
}
