class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;
            if (leftSum == totalSum - leftSum + i) {
                return i;
            }
        }
        return -1; // Return -1 if no pivot integer is found
    }
}
