package threadexamples;

public class CounterThread extends Thread{
    public String name;
    public CounterThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("the value is "+i);
        }
    }
}
