class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        String s = "";
        String str[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);

            if (str[i].length() % 2 == 0)
                count++;
        }
        return count;
    }
}