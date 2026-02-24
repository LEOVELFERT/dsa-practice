package thiru;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {

//        int appleCount=5;
//
//        for(int i=0;i<appleCount;i++){
//            eat();
//        }


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the apple count ");
        int appleCount = sc.nextInt();

        while(appleCount>0){
            eat();
            appleCount--;
        }
    }

    private static void eat() {
        System.out.println("I am eating the apple now remaining apple");
    }

}
