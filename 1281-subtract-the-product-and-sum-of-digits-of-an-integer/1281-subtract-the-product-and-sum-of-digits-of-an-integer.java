class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0, prod = 1, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            prod = prod * rem;
            n /= 10;
        }
        return prod - sum;
    }
}