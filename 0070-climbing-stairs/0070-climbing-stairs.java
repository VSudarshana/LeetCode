class Solution {
    public int climbStairs(int n) {
        if(n==0||n==1)
        return n;
       int x=1;
       int y=1;
       int z=0;
       for(int i=2;i<=n;i++){
        z=x+y;
        x=y;
        y=z;
       }
    return z;
    }
}