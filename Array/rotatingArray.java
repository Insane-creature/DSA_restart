package Array;

import java.util.Arrays; // Import Arrays for printing the array

class rotatingArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        
        // Copy the last k elements of nums to temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        
        // Shift the first n-k elements to the right
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        
        // Copy the elements from temp back to nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        
        // Print the rotated array
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
    }
}
