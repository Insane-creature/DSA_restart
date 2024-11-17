package Binary_Search.OneDArray;

public class floorAndCeil {
    public static void main(String[] args) {
        int []nums = {3, 4, 4, 7, 8, 10};
        int k = 8;
        int left = 0, right = nums.length-1;
        int floor = -1, ceil = -1;

        while(left <= right){
            int mid = (left+right)/2;
            

            // if(nums[mid]==k) System.out.println("floor: " + floor + " and ceil: " + ceil);
            if (nums[mid] == k) {
                floor = nums[mid];
                ceil = nums[mid];
                break; // Target found, floor and ceil are the same
            }
            else if(nums[mid] > k){
                ceil = nums[mid];
                right = mid-1;
            }
            else{
                floor = nums[mid];
                left = mid+1;
            }

        }
        System.out.println("floor: " + floor + " and ceil: " + ceil);

    }
}
