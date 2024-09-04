class TuSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;        
        int []result;
        // {2,7,11,15};
        for(int j = 1; j < nums.length-1; j++){
            if(nums[i]+nums[j] == target){ // 11,15
                return new int[]{i, j};
            }
            i++;
        }
        return new int[]{}; // No solution found
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 27;
        System.out.println(twoSum(nums, target));
        
    }
}
