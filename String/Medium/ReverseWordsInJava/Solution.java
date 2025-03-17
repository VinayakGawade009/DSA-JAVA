class Solution { // TC: O(n) SC: O(1)
    public String reverseWords(String s) {
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder("");
        while(i>=0) {
            while(i>=0 && s.charAt(i) == ' ') {
                i--;
            }
            if(i<0) break;
            
            int j = i;
            while(i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if(sb.length() > 0) {
                sb.append(" ");
            }

            sb.append(s.substring(i+1, j+1));
        }
        return sb.toString();

    }
}

// class Solution { // TC: O(n) SC: O(n)
//     public String reverseWords(String s) {
//         s = s.trim();
//         String[] words = s.split("\\s+");
//         StringBuilder sb = new StringBuilder("");
        
//         for(int i=words.length-1; i>=0; i--) {
//             System.out.println(words[i]);
//             sb.append(words[i]);
//             if(i > 0) {

//             sb.append(" ");
//             }
//         }
//         return sb.toString();

//     }
// }