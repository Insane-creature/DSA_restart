package Binary_Search.OnAnswers;

public class MBouquets {
    static boolean helper(int[] arr , int day, int m , int k){
            int count=0;
            int ans = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=day)
                count++;
                else{
                   ans += count/k;
                   count=0;
                }
            }
            ans += count/k;
            if(ans>=m)
            return true;
            return false;
        }
        public static int minDays(int[] bloomDay, int m, int k) {
                if(m*k>bloomDay.length)
                return -1;
                int start = Integer.MAX_VALUE;
                int end = 0;
                for(int i=0;i<bloomDay.length;i++){
                    start = Math.min(start,bloomDay[i]);
                    end = Math.max(end,bloomDay[i]);
                }
                int ans = -1;
                while(start<=end){
                    int mid = (start+end)/2;
                    if(helper(bloomDay , mid , m ,k) == true){
                end=mid-1;
                ans=mid;}
                else
                start = mid+1; 
            }
            return ans;
        }
        public static void main(String[] args) {
            int []bloomDay = {1,10,3,10,2};
            int m = 3, k = 1;
    
            System.out.println(minDays(bloomDay, m, k));

        
    }
}
