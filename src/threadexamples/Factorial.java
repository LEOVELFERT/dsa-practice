package threadexamples;

import java.util.List;

public class Factorial {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums=List.of(1,2,3,4);
        printFactorial(nums);
    }

    public static void printFactorial(List<Integer> nums) throws InterruptedException {
        for(Integer num:nums){
            Runnable runnable=()->{
                Integer factorialNum = findFactorial(num);
                System.out.println("Num : "+num+" factorial num : "+factorialNum+"by this thread"+Thread.currentThread().getName());
            };
            Thread thread=new Thread(runnable);
            thread.setName("Factorial Thread"+num);
            thread.start();
            thread.join(200000);
        }
    }

    public static Integer findFactorial(Integer num) {
        if(num==1){
            return num;
        }
        Integer sum=1;
        for(int i=2;i<=num;i++){
            sum=sum*i;
        }
        return num;
    }
}
