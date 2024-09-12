package Array;

import java.util.Arrays; // Import Arrays for printing the array

class rotatingArray {
    
    public static int[] reversing(int[] arr, int start, int end){
        int i = 0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
        
    }
    
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reversing(nums, 0, n-1);
        reversing(nums, 0, k-1);
        reversing(nums, k, n-1);

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
