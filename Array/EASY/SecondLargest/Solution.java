// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int secLargest = -1;
        for(int el : arr) {
            if(el > largest) {
                secLargest = largest;
                largest = el;
            } else if(secLargest < largest && el > secLargest && el < largest) {
                secLargest = el;
            }
        }
        return secLargest;
    }
}

// Or sort array and return second last element