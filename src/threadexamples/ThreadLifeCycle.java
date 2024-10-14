package threadexamples;
class ThreadCycle implements Runnable{


    @Override
    public void run() {
        callSynchronized();
    }

    public static synchronized void callSynchronized() {
        while (true) {

        }
    }
}

public class ThreadLifeCycle{
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable=()-> System.out.println("hai");
        Runnable runnable1=new ThreadCycle();
        Runnable runnable2=new ThreadCycle();
        Thread thread=new Thread(runnable1);
//        Thread thread1=new Thread(()-> System.out.println("pod porambokku"));
        Thread thread1= new Thread(runnable2);
        System.out.println("The current Thread State :"+thread.getState());
        thread.start();
        System.out.println("The current Thread State :"+thread.getState());
        thread1.start();
        Thread.sleep(1000);
        System.out.println("the T2 thread state :"+thread1.getState());
        System.exit(0);

    }
}
