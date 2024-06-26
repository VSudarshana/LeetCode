class Solution {
    public int largestCombination(int[] candidates) {
        int bin[] = new int[32];
        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < 32; j++) {
                int temp = candidates[i] & (1 << j);
                if (temp != 0) {
                    bin[j] += 1;
                }
            }

        }
        int max1 = 0;
        for (int k = 0; k < bin.length; k++)
            max1 = Math.max(max1, bin[k]);
        return max1;
    }
}