
public class maxCons {

    public static int findMaxConsecutiveOnes(int[] nums, int k) {
        int maxConsecutiveOnes = 0;

        // Check every possible starting point
        for (int i = 0; i < nums.length; i++) {
            int zeroCount = 0;
            int length = 0;

            // Expand the subarray starting at 'i'
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeroCount++;
                }

                // If zero count is within k, calculate the length
                if (zeroCount <= k) {
                    length = j - i + 1;
                    maxConsecutiveOnes = Math.max(maxConsecutiveOnes, length);
                } else {
                    break;  // Stop expanding if zero count exceeds k
                }
            }
        }

        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        int k = 2;
        System.out.println("Maximum consecutive 1's (with up to " + k + " flips): " + findMaxConsecutiveOnes(nums, k));
    }
}
