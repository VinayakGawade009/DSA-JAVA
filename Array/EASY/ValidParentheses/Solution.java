import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                s1.push(ch);
            } 
            else if(ch == ')') {
                if(s1.isEmpty() || s1.pop() != '(') {
                    return false;
                }
            } else if(ch == ']') {
                if(s1.isEmpty() || s1.pop() != '[') {
                    return false;
                }
            } else if(ch == '}') {
                if(s1.isEmpty() || s1.pop() != '{') {
                    return false;
                }
            }
        }

        if(!s1.isEmpty()) {
            return false;
        }

        return true;
    }
}