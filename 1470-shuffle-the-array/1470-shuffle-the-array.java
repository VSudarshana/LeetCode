
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            shuffled[index++] = nums[i];
            shuffled[index++] = nums[i + n];
        }
        return shuffled;
    }
}
