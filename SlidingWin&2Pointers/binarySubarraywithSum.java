public class binarySubarraywithSum {
    public static int countSubArray(int []nums, int k){
        int n = nums.length;
        int count=0;

        if(k<0) return 0;

        for (int left = 0; left < n; left++) {
            int sum = 0;
            int right = left;

            while(right<n){
                sum = sum + nums[right];

                if(sum == k) count++;

                if(sum>k) {
                    break;
                }
                // count = count + (right-left+1);
                right++;

            }        
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr = {1, 0, 1, 1, 0, 1};
        int k = 2;
        System.out.println(countSubArray(arr, k));
    }
}
