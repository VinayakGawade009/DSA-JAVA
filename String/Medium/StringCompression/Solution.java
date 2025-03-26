// Time Complexity:𝑂(𝑁) since we traverse the array once.
// Space Complexity:𝑂(1) as we modify the array in-place without extra storage.

class Solution {
    public int compress(char[] chars) {
        int index = 0; // pointer for writing compressed data in-place in chars array
        int i = 0; // iterator for traversing chars array

        while(i<chars.length) {
            int count = 0;

            char currChar = chars[i];

            // counting occurences of currChar
            while(i<chars.length && chars[i] == currChar) {
                i++;
                count++;
            }

            chars[index++] = currChar;

            if(count>1) {
                for(char ch: Integer.toString(count).toCharArray()) {
                    chars[index++] = ch;
                }
            }

        }
        return index; // new length of modified chars array

    }
}