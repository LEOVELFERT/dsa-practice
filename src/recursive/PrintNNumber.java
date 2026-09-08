package recursive;

public class PrintNNumber {
    public static void main(String[] args) {
        nPrint(5);
    }
    static void nPrint(int number){
        if(number==0){
            return;
        }
        nPrint(number-1);
        System.out.println(number);
    }
}
