package blindly75;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        int[] finaNewArray=new int[length];

        int product=1;

        for(int i=0;i<length;i++){
            finaNewArray[i]=product;
            product = product * nums[i];
        }

        product=1;

        for(int j=length-1;j>=0;j--){
            finaNewArray[j] = finaNewArray[j]*product;
            product = product*nums[j];
        }
        return finaNewArray;
    }


    public static void main(String[] args) {
        ProductArray productArray=new ProductArray();
        int[] result = productArray.productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }
}
