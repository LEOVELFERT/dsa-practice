package threadexamples;
class WaitingThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}
public class WaitingStage {
    public static void main(String[] args) {
        Thread thread=new Thread(new WaitingThread());
        thread.start();
        try{
            thread.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("main :"+Thread.currentThread().getState());
    }
}
