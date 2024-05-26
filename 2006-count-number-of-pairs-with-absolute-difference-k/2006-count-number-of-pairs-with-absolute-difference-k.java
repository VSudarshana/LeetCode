class Solution {
    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        int diff = 0, count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                diff = Math.abs(nums[i] - nums[j]);
                if (diff == k) {
                    count++;
                }
            }
        }
        return count;
    }
}