class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int endIdx = m+n-1;
        while(n > 0 && m > 0) {
            if(nums1[m-1] <= nums2[n-1]) {
                nums1[endIdx] = nums2[n-1];
                n--;
            } else {
                nums1[endIdx] = nums1[m-1];
                m--;
            }
            endIdx--;
        }
        while(n > 0) {
            nums1[endIdx] = nums2[n-1];
            n--;
            endIdx--;
        }
    }
}