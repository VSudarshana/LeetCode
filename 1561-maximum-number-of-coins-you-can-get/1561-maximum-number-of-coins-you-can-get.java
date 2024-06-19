class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int index=n-2;
        int sum=0;
        for(int i=0;i<n/3;i++){
           sum+=piles[index];
           index=index-2;
        }
        return sum;
    }
}