// class Solution {
//     public boolean isPossibleToSplit(int[] nums) {
//         if (nums.length % 2 == 0) {
//             return true;
//         }
//         int nums1[] = new int[nums.length/2];
//         int nums2[] = new int[nums.length/2];
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] != nums[j]) {
//                     nums1[i] = nums[i];
//                 } else {
//                     nums2[i] = nums[i];
//                 }
//                 if (nums1[i] != nums1[j]) {
//                     return true;
//                 }
//             }

//         }
//         return false;
//     }
// }

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    cnt++;
                if (cnt > 1)
                    return false;

            }
        }
        return true;
    }
}