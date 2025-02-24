// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=inversion-of-array

class Solution { // TC: O(nlogn) & SC: O(n) {altering the given data but we can also make copy of it and then do our work}

    public static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; 
        int left = low, right = mid + 1, i = 0;
        int count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i++] = arr[left++];
            } else {
                count += (mid - left + 1);  // Count inversions
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

        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;
        int count = 0;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;
    }

    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }
}