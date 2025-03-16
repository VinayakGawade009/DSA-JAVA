class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen) return false;

        char[] frequency = new char[26];

        for(int i=0; i<sLen; i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for(int i: frequency) {
            if(i != 0) return false;
        }

        return true;

    }
}

// class Solution { // O(nlogn)
//     public boolean isAnagram(String s, String t) {
//         int sLen = s.length();
//         int tLen = t.length();

//         if(sLen != tLen) return false;

//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();

//         Arrays.sort(sArr);
//         Arrays.sort(tArr);

//         return Arrays.equel(sArr, tArr);

//     }
// }