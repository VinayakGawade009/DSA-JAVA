// https://leetcode.com/problems/decode-string/

import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>(); // stores numbers for repeating string in brackets[]
        Stack<StringBuilder> st = new Stack<>(); // stores string to be added in answer

        StringBuilder sb = new StringBuilder(); // temporarily stores string chunk in given string to be appended in result
        int num = 0; // stores current number for repeating string in brackets[]
        
        for(char ch : s.toCharArray()) {

            if(ch >= '0' && ch <= '9') { // if number

                int digit = ch - '0';

                num = num * 10 + digit; // form final number which times we have to store string

            } else if( ch == '[') { 

                st.push(sb); // save existing string in result
                sb = new StringBuilder();
                numStack.push(num); // push final number in numStack
                num = 0; // assign 0 for next repeating string

            } else if( ch == ']') {

                StringBuilder temp = sb;

                sb = st.pop(); // repeating string
                int count = numStack.pop(); // final number

                while(count > 0) { // store string num times

                    sb.append(temp);
                    count--;

                }
            } else {

                sb.append(ch);

            }
        }

        return sb.toString();
    }
}