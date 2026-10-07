class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int left = 0 , right  = n , i =0;
        for(int j = 0 ;j<nums.length/2 ;j++){
           ans[i++] = nums[left++];
            ans[i++] = nums[right++];
        }
        return ans;
    }
}