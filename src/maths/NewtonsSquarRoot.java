package maths;

public class NewtonsSquarRoot {
    public static void main(String[] args) {
        System.out.println("The newton Square root"+newtonsSquareRoot(36));
    }

    private static double newtonsSquareRoot(int n) {
        double x=n;
        double root;

        while(true){
            root = 0.5*(x+ (n/x));
            if( Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
