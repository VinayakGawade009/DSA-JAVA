class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i >= 0) {
            if(digits[i] == 9) {
                digits[i] = 0;
                i--;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        
        int arr[] = new int[digits.length+1];
        arr[0] = 1;
        for(int j=1; j<arr.length; j++) {
            arr[j] = 0;
        }
        return arr;
    }
}