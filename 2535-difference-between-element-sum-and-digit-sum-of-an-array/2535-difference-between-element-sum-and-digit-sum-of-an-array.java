class Solution {
    public int differenceOfSum(int[] nums) {
        int len =nums.length;
        int arrSum=0;
        int digSum=0;
        for(int i=0;i<len;i++){
          arrSum+=nums[i];
          while(nums[i]!=0){
            int rem=nums[i]%10;
            digSum+=rem;
            nums[i]/=10;
          }
        }
       return Math.abs(arrSum-digSum);
    }
}