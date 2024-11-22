public class practice {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int result = binarySearch(nums, target);
        System.out.println(result); 
    }
    public static int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }

        return -1; 
    }
}
