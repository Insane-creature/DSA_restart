package Binary_Search.OneDArray;

public class lowerbound {
    
    public static int lowerbounding(int[] nums, int target){
        int low = 0, right = nums.length-1, mid=0;
        while(low <= right){
            int ans = nums.length;
            mid = (low+right)/2;            // 3
            
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }
            else{           // 5 <=9
                low = mid + 1;
            }

        }  
        return mid;
    }

    public static void main(String[] args) {
        int []nums = {5, 7, 7, 8, 8, 10};
        int k = 8;
        System.out.println(lowerbounding(nums, k));

    }
}
