class countNoOfNiceSubarray {
    public static int countingSubArray(int[] arr, int k){
        int count = 0;
        int left = 0, oddCount = 0;
        int n = arr.length;

        // Count of subarrays with exactly `k` odd numbers
        int subarraysWithKOdds = 0;

        for (int right = 0; right < n; right++) {
            // If the current number is odd, increment `oddCount`
            if (arr[right] % 2 != 0) {
                oddCount++;
            }

            // If we have more than `k` odd numbers, move the `left` pointer
            while (oddCount > k) {
                if (arr[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }

            // If we have exactly `k` odd numbers, count the subarrays
            if (oddCount == k) {
                // Temporary pointer to count the number of valid subarrays
                int tempLeft = left;

                // Count the number of subarrays starting from `left` to `right`
                while (tempLeft < right && arr[tempLeft] % 2 == 0) {
                    tempLeft++;
                }

                // All subarrays between `tempLeft` and `left` are valid
                subarraysWithKOdds += (tempLeft - left + 1);
            }
        }

        return subarraysWithKOdds;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,1,1};
        int k = 3;
        System.out.println(countingSubArray(arr, k));
    }
}