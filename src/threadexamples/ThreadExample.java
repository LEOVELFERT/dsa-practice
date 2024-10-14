    package threadexamples;

    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.ThreadLocalRandom;

    public class ThreadExample {
        public static void main(String[] args) {

            ExecutorService service= Executors.newFixedThreadPool(2);
            Runnable t1Runnable=()-> printValue("thread1");
            Runnable t2Runnable=()-> printValue("thread2");
    //        Thread t1=new CounterThread("thread1");
    //        Thread t2=new CounterThread("thread2");
            service.submit(t1Runnable);
            service.submit(t2Runnable);
            service.shutdown();
        }

        private static void printValue(String threadName) {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " - value: " + i);
                try {
                   Thread.sleep(ThreadLocalRandom.current().nextInt(100,500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
