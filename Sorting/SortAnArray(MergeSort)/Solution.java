class Solution {

    public int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int result[] = new int[len1 + len2]; 

        int j = 0, k = 0, i = 0;
        while (j < len1 && k < len2) {
            if (arr1[j] <= arr2[k]) {
                result[i++] = arr1[j++];
            } else {
                result[i++] = arr2[k++];
            }
        }

        while (j < len1) {
            result[i++] = arr1[j++];
        }

        while (k < len2) {
            result[i++] = arr2[k++];
        }

        return result;
    }

    public int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) return new int[]{arr[low]}; // Return a single-element array

        int mid = (low + high) / 2;

        int arr1[] = mergeSort(arr, low, mid);
        int arr2[] = mergeSort(arr, mid + 1, high);
        return merge(arr1, arr2);
    }

    public int[] sortArray(int[] arr) { // TC: O(nlogn) & SC: O(n) {for easy of merging and ifficiency}
        if (arr.length == 0) return arr;
        return mergeSort(arr, 0, arr.length - 1);
    }
}
