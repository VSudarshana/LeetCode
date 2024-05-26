class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c = 0;
        int d1 = 0, d2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    d1 = nums[j] - nums[i];
                    d2 = nums[k] - nums[j];

                    if (d1 == diff && d2 == diff) {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}