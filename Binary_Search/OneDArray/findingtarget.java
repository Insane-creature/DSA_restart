package Binary_Search.OneDArray;

public class findingtarget {
    public static void main(String[] args) {
        int []nums = {-1,0,3,5,9,12};
        int target = 9;
        int mid = 0;

        int low = 0, right = nums.length-1;
        while(low <= right){
            mid = (low+right)/2;            // 3
            if(nums[mid] >= target){            // 5 <=9
                if(nums[mid] == target)System.out.println(mid);
                right = mid - 1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }

        }     
        // System.out.println(mid);   

    }
}
