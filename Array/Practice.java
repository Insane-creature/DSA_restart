public class Practice {
    public static int maxProfit(int []nums, int k){
        for(int i = k; i < nums.length-k-1; i++){
            System.out.println(nums[k+1]);
        }
        for(int i = 0; i < k; i++){
            System.out.println(nums[k]);
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(maxProfit(nums,k));
    }
}