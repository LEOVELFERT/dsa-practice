package recursion;

public class BianarySearch {
    public static void main(String[] args) {
        int[] a = {2, 4, 78, 100, 102};
        int target = 100;
        int ans = search(a, target, 0, a.length - 1);
        System.out.println("The target present in the index : " + ans);
    }

    static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        //find mid element
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] < target) {
            return search(array, target, mid + 1, end);
        }
        return search(array, target, start, mid - 1);
    }
}
