package Array;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
         for (int i = 1; i < nums.length; i++) {
             if (nums[i] != nums[i - 1]) {
                 nums[j] = nums[i];
                 j++;
             }
         }
         return j; 
     }
    public static void main(String[] args) {
        int []nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        // int[] sortedArray = {0};

        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] == nums[i+1]){
        //         sortedArray[i] = nums[i];
        //     }
        // }
    }
}