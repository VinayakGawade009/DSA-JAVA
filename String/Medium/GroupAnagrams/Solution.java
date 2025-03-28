// https://leetcode.com/problems/group-anagrams/

// Let N be the number of words in strs.

// Let M be the average length of a word.

// Final Time Complexity: O(NMlogM)

// Space Complexity : O(NM)

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}

// How works
// "aet"	["eat", "tea", "ate"]
// "ant"	["tan", "nat"]
// "abt"	["bat"]