class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans =Integer.MAX_VALUE;
        int info = 0 ;
        for(int high = 0 , low = 0 ; high<nums.length;high++){
            info += nums[high] ;
            while(info >= target ){
                ans = Math.min(ans,high-low+1);
                info -= nums[low++];
            }
        }
        if(ans == Integer.MAX_VALUE) return 0 ;
        return ans;
    }
}