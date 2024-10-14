package LinearSearch;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 34, 45, 5, 6};
        int maximum = findMaximum(arr);
        System.out.println("the maximum value for this number :" + maximum);
    }

    public static int findMaximum(int[] arr) {
        int maximum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
