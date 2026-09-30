class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int ans =  Math.abs(nums[0]); 
       int max = nums[0] ; 
       int min = nums[0] ;

       for(int i =1 ; i< nums.length ;i++){
        max = Math.max(nums[i] , max+nums[i]);
        min = Math.min(nums[i] ,  min+nums[i]);
        ans = Math.max(ans , Math.max(max , Math.abs(min)));
       } 
       return ans;
    }
}