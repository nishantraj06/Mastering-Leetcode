class NumArray {
     ArrayList<Integer> list = new ArrayList<>(); 
    
    public NumArray(int[] nums) {
        list.add(0);
        for(int i = 0 ; i<nums.length;i++){
            list.add(nums[i]+list.get(i));
        }
    }
    
    public int sumRange(int left, int right) {
        return(list.get(right+1)-list.get(left));
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */