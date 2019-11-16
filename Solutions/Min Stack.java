// problem link
// https://leetcode.com/problems/min-stack/

class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** initialize your data structure here. */
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
        if(s2.isEmpty() || x <= getMin()) s2.push(x);
    }
    
    public void pop() {
        if((!s1.isEmpty()) && (s1.peek() == getMin())) s2.pop();
        if(!s1.isEmpty()) s1.pop();
    }
    
    public int top() {
        return s1.isEmpty()? 0 : s1.peek();
    }
    
    public int getMin() {
        return s2.isEmpty()? 0 : s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */