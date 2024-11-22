package Binary_Search.OneDArray;

import java.util.Arrays;

public class firstAndlastOcc {
    public static int firstOcc(int[] nums, int target) {
        
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid; 
                high = mid - 1; 
            } else if (nums[mid] > target) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return result;

    }

    public static int lastOcc(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid; 
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int []nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int []result = new int[2];
        result[0] = firstOcc(nums, target);
        result[1] = lastOcc(nums, target);
        
        System.out.println(Arrays.toString(result));

        
    }
}