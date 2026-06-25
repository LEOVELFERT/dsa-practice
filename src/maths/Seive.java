package maths;

public class Seive {
    public static void main(String[] args) {
        int number =40;
        boolean[] primeNumbers=new boolean[number+1];
        seive(number,primeNumbers);
    }

    static void seive(int number,boolean[] booleans){
        for(int i=2;i*i<=number;i++){
            if(!booleans[i]){
                for(int j=i*i;j<=number;j+=i){
                    booleans[j]=true;
                }
            }
        }

        for(int i=2;i<number;i++){
            if(!booleans[i]){
                System.out.print(i+",");
            }
        }
    }
}
