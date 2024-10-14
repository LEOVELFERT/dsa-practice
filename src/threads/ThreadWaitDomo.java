package threads;

public class ThreadWaitDomo {
    public static void main(String[] args) {
        ThreadSharedData threadSharedData=new ThreadSharedData();
       Thread producer=new Thread(()->{
           for(int i=0;i<5;i++){
               try {
                   threadSharedData.produce(i);
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   System.out.println("the exception happened while producing the data");
               }
           }
       });

       Thread consumer=new Thread(()->{
           for(int i=0;i<5;i++){
               try {
                   threadSharedData.consume(i);
                   Thread.sleep(1500);
               } catch (InterruptedException e) {
                   System.out.println("the exception happened while producing the data");
               }
           }
       });
       producer.start();
       consumer.start();
    }
}
