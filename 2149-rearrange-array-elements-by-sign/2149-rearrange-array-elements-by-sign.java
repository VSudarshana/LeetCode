class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int a[]= new int[n];
        for(int i=0,j=0,k=1;i<n;i++){
            if(nums[i]<0){
            a[k]=nums[i];
            k+=2;
            }
            else
            {
                a[j]=nums[i];
                j+=2;
            }
        }
        return a;
    }
}