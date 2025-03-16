class Solution {
    public boolean isPalindrome(String s) { // Without extra space
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

}

// With extra space

// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb = new StringBuilder("");
//         for(int i = 0; i<s.length(); i++) {
//             if(Character.isLetterOrDigit(s.charAt(i))) {
//                 sb.append(Character.toLowerCase(s.charAt(i)));
//             }
//         }

//         int n = sb.length();
//         for(int i = 0; i< n/2; i++) {
//             if(sb.charAt(i) != sb.charAt(n - i -1)) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
