class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            int rev=0;
            while(nums[i]!=0)
            {
                int rem=nums[i]%10;
                rev=(rev*10)+rem;
                nums[i]=nums[i]/10;
            }
            arr[n+i]=rev;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n*2;i++)
        {
            hs.add(arr[i]);
        }
        return hs.size();
    }
}