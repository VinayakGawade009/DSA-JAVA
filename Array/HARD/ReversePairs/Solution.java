// https://leetcode.com/problems/reverse-pairs/submissions/1553894573/

class Solution { 

    // TC: O(logn) {for division} * O(n + n)
    // SC: O(n) => changing original data (if don't want to then use copy of an array)

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; 
        int left = low, right = mid + 1, i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i++] = arr[left++];
            } else {
                temp[i++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[i++] = arr[left++];
        }

        while (right <= high) {
            temp[i++] = arr[right++];
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, low, temp.length);

    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid+1;
        int count = 0;
        for(int i=low; i <= mid; i++) {
            while(right <= high && arr[i] > (long)2*arr[right]) right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;
        int count = 0;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high); // before each merge operation have to find reverse pairs from arr
        merge(arr, low, mid, high);

        return count;
    }

    public int reversePairs(int[] nums) {
        
        return mergeSort(nums, 0, nums.length-1);
    }
}