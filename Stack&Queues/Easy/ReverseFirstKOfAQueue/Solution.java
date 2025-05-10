// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1


import java.util.*;
class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k > q.size()) return q;
        
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        
        
        for(int i=0; i<k; i++) {
            s.push(q.remove());
        }
        
        while(!s.empty()) {
            q.add(s.pop());
        }
        
        for(int i=0; i < size - k; i++) {
            q.add(q.remove());
        }
        
        return q;
    }
}