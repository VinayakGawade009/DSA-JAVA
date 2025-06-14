// https://leetcode.com/problems/online-stock-span/



import java.util.*;

class Node {
    int value, span;

    public Node(int value, int span) {
        this.value = value;
        this.span = span;
    }
}

class StockSpanner {

    Stack<Node> stack; // object creation

    public StockSpanner() {
        stack = new Stack<Node>(); // object memory allocation
    }
    
    public int next(int price) {
        if(stack.empty()) {
            stack.push(new Node(price, 1));
            return 1;
        } else {
            Node prev = stack.peek();
            if(prev.value > price) {
                Node temp = new Node(price, 1);
                stack.push(temp);
                return 1;
            } else {
                int count = 0;
                while(!stack.empty() && stack.peek().value <= price) {
                    prev = stack.pop();
                    count = count + prev.span;
                }
                stack.push(new Node(price, 1 + count));
                return 1 + count;
            }
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */