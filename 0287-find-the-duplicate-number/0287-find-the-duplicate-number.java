class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(nums[n] < 0) return n;
            nums[n] *= -1;
        }
        return -1;
    }
}