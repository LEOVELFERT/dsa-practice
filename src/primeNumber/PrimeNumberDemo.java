package primeNumber;

import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter the n value for nth primeNumber");
        int n=scanner.nextInt();
        int nthPrimeNumber = getNthPrimeNumber(number, n);
        System.out.println("The nth primeNumber is ======"+nthPrimeNumber);
    }

    public static int getNthPrimeNumber(int number, int n) {
        boolean primeFlag=true;
        int primeCount=0;
        number++;
       while(primeFlag){
           if(isPrimeNumberOrNot(number)){
               primeCount++;
           }
           if(primeCount==n){
               return number;
           }
           number++;
       }
        return primeCount;
    }

    public static boolean isPrimeNumberOrNot(int num){
        if(num==2){
            return true;
        }else if(num==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
