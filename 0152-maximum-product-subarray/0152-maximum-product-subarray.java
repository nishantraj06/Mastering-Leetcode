class Solution {
    public int maxProduct(int[] nums) {
       int ans = nums[0];
       int max = nums[0];
       int min = nums[0];

       for(int i = 1 ; i < nums.length ; i++){
        int v1 = nums[i];
        int v2 = nums[i] * max ;
        int v3 = nums[i] * min ;
        min = Math.min(v1 , Math.min(v2 , v3));
        max = Math.max(v1 , Math.max(v2 , v3));
        ans = Math.max(ans , max);
       }
       return ans;
    }
}