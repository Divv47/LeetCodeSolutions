class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int lo = 0;
        int hi = 1;
        int x = 0 ;
        while(hi<nums.length){
            if(nums[lo]==nums[hi]){
                lo +=2;
                hi+=2;
            }
            else return x = nums[lo];
        }
        return nums[lo];
    }
}