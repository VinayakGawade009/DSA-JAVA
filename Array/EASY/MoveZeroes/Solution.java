class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[idx] = temp;
                idx++;
            }
        }
    }
}

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int snowBallSize = 0;
//         for(int i=0; i<nums.length; i++) {
//             if(nums[i] == 0) {
//                 snowBallSize++;
//             } else {
//                 int temp = nums[i];
//                 nums[i] = 0;
//                 nums[i - snowBallSize] = temp;
//             }
//         }
//     }
// }