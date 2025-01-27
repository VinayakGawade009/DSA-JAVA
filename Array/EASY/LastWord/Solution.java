class Solution {
    // 0ms
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end>=0 && s.charAt(end) == ' ') {
            end--;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end-start;
    }

    // 1ms
    // public int lengthOfLastWord(String s) {
    //     String words[] = s.split(" ");
    //     int lastIdx = words.length-1;
    //     return words[lastIdx].length();
    // }
}