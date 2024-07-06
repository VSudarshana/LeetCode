// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] arr = new int[nums1.length];
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums1[i] == nums2[j]) {
//                     if (nums2[j] > nums2[j + 1]) {
//                         arr[i] = nums2[j+1];
//                     } else {
//                         arr[i] = -1;
//                     }
//                 }
//             }
//         }
//         return arr;
//     }
// }


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            boolean hasGreater = false;
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
                
                if (found && nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    hasGreater = true;
                    break;
                }
            }
            
            if (!hasGreater) {
                result[i] = -1;
            }
        }
        
        return result;
    }
}
