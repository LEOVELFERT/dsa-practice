package maths;
//it will be applicable if only one unique number is availble.
public class UniqueNumber {
    public static void main(String[] args) {
        int arr[]={2,1,2,1,3};
        System.out.println("The unique number :"+findUnique(arr));
    }

    public static int findUnique(int arr[]){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
