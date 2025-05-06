// https://leetcode.com/problems/implement-queue-using-stacks/description/


import java.util.*;

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }
    
    public void push(int x) { // O(N)
        while(!s1.empty()) {
            s2.push(s1.pop());
        }
        s2.push(x);
        while(!s2.empty()) {
            s1.push(s2.pop());
        }
    }
    
    public int pop() { // O(1)
        if(empty()) return -1;
        
        return s1.pop();
    }
    
    public int peek() { // O(1)
        if(empty()) return -1;

        return s1.peek();
    }
    
    public boolean empty() { // O(1)
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */



// class MyQueue {

//     Stack<Integer> s1 = new Stack<>();
//     Stack<Integer> s2 = new Stack<>();

//     public MyQueue() {

//     }
    
//     public void push(int x) { // O(1)
//         s1.push(x);
//     }
    
//     public int pop() { // O(N)
//         if(empty()) return -1;

//         while(!s1.empty()) {
//             s2.push(s1.pop());
//         }

//         int result = s2.pop();

//         while(!s2.empty()) {
//             s1.push(s2.pop());
//         }

//         return result;
//     }
    
//     public int peek() { // O(N)
//         if(empty()) return -1;

//         while(!s1.empty()) {
//             s2.push(s1.pop());
//         }

//         int result = s2.peek();

//         while(!s2.empty()) {
//             s1.push(s2.pop());
//         }

//         return result;
//     }
    
//     public boolean empty() { // O(1)
//         return s1.empty();
//     }
// }