package voltile;

public class Worker extends Thread{

    private volatile boolean running=true;
    @Override
    public void run() {
        System.out.println("Worker started.");
        while (running) {
            System.out.println("The running is true");
        }
        System.out.println("Worker stopped.");
    }

    public void stopWorker(){
        this.running=false;
    }
}
