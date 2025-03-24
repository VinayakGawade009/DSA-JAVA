import java.util.HashMap;

class Solution { // using 2 hashmaps
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }

            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;        
    }
}

// class Solution { // using 1 hashmap
//     public boolean isIsomorphic(String s, String t) {
//         if (s.length() != t.length()) {
//             return false; // Strings must be of equal length
//         }

//         HashMap<Character, Character> charMap = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char sc = s.charAt(i);
//             char tc = t.charAt(i);

//             if (charMap.containsKey(sc)) {
//                 if (charMap.get(sc) != tc) {
//                     return false;
//                 }
//             } else if (charMap.containsValue(tc)) {
//                 return false;
//             }

//             charMap.put(sc, tc);
//         }

//         return true;         
//     }
// }

