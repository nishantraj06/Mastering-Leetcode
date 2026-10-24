class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window = 0 ;
        for(int i = 0 ; i<k;i++)
            window += nums[i];
        int maxWindow = window;
        for(int high = k , low = 0 ; high < nums.length ; high++ , low++){
            window = window + nums[high] - nums[low];
            if(window > maxWindow)
                maxWindow = window;
        }

        double ans = maxWindow / (k * 1.0);
        return ans;
    }
}