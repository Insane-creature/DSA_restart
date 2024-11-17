package Binary_Search.OneDArray;

import java.util.Arrays;

public class FindingFirstandLastOccurrence {

    public static int lowerbounding(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow
            if (nums[mid] >= target) {
                ans = mid; // Possible lower bound
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }
        return ans;
    }

    public static int upperbounding(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                ans = mid; // Possible upper bound
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }
        return ans;
    }

    public static int[] occurrences(int[] nums, int k) {
        int lb = lowerbounding(nums, k);
        // Check if the target exists in the array
        if (lb == nums.length || nums[lb] != k) {
            return new int[]{-1, -1};
        }
        int ub = upperbounding(nums, k);
        return new int[]{lb, ub - 1}; // Last occurrence is upper bound - 1
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int k = 8;
        System.out.println(Arrays.toString(occurrences(nums, k)));
    }
}
