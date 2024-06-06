// class Solution {
//     public int arrayPairSum(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int min = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 min = Math.min(nums[i], nums[j]);
//                 list.add(min);
//             }
//         }
//         Collections.sort(list);
//         return list.get(list.size() - 1);
//     }
// } 

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];  // Sum the elements at even indices
        }
        return sum;
    }
}
