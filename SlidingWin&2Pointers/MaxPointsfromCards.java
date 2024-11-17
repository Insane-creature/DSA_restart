public class MaxPointsfromCards {
    public static void main(String[] args) {
        int[] nums = {6, 2, 3, 4, 7, 2, 1, 7, 1};  
        int k = 4;  
        int n = nums.length;  

        // Calculating the initial sum by picking first k cards from the left side
        int lsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += nums[i];
        }

        int maxPoints = lsum;

        // Taking one down left and adding one from right
        int rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum - nums[k - 1 - i];  
            rsum = rsum + nums[n - 1 - i];  
            maxPoints = Math.max(maxPoints, lsum + rsum);  // Update the maxPoints
        }

        System.out.println("Maximum points you can obtain: " + maxPoints);
    }
}
