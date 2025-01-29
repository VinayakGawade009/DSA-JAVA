class Solution {
    public void sortColors(int[] nums) {
        int freq[] = new int[3];
        int n = nums.length;
        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }
        int idx = 0;
        for(int i=0; i<freq[0]; i++) {
            nums[idx] = 0;
            idx++;
        }
        for(int i=0; i<freq[1]; i++) {
            nums[idx] = 1;
            idx++;
        }
        for(int i=0; i<freq[2]; i++) {
            nums[idx] = 2;
            idx++;
        }
    }
}