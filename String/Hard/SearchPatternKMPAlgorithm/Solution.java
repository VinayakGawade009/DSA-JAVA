// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/search-pattern0205

import java.util.*;
class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int[] lps = buildLPS(pat);
        int i = 0, j = 0; // i for txt, j for pat
        
        while(i < txt.length()) {
            if(txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
                if(j == pat.length()) {
                    res.add(i - j); // match found
                    j = lps[j - 1]; // check for next possible match
                }
            } else {
                if(j != 0) {
                    j = lps[j - 1]; // jump pat ptr
                } else {
                    i++; // move txt ptr
                }
            }
        }
        return res;
    }
    
    private int[] buildLPS(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        int len = 0; // length of previous longest prefix suffix
        int i = 1;
        
        while(i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len - 1]; // backtrack to previous prefix length
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}


// ✨ Step 1: Build the LPS (Prefix) Array
// Given a pattern pat, LPS[i] tells us:

// The length of the longest prefix which is also a suffix in pat[0...i].

// This helps us avoid restarting from the beginning when we see a mismatch.

// Example:
// Pattern = "aaba"
// LPS = [0, 1, 0, 1]

// Why?

// At index 1 → "aa" has common prefix & suffix of length 1.

// At index 2 → "aab" has no prefix = suffix.

// At index 3 → "aaba" has "a" as both prefix and suffix.

// ✨ Step 2: Use LPS to Search Efficiently
// While comparing txt and pat:

// If characters match, move both i and j.

// If there's a mismatch:

// Use lps[j-1] to jump the pattern pointer j back.

// Avoid rechecking known matches.

