class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int len = s.length();
        char[] sChars = s.toCharArray();

        // All possible rotations of the string
        for(int i=0; i<len; i++) {
            sChars = rotateOnce(sChars);
            if(new String(sChars).equals(goal)) return true;
        }

        return false;
    }

    private char[] rotateOnce(char[] arr) {
        char firstChar = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);

        arr[arr.length - 1] = firstChar;
        return arr;
    }
}

// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()) return false;

//         String c = s+s;
//         int left = 0, right = s.length()-1;
//         while(right<c.length()) {
//             // System.out.println(c.substring(left, right+1));
//             if(c.substring(left, right+1).equals(goal)) return true;
//             right++;
//             left++;
//         }
//         return false;
//     }
// }