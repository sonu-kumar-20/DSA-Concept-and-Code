class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        } else {
            minSt.push(minSt.peek()); // repeat last min
        }
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            minSt.pop();
        }
    }
    
    public int top() {
        return st.isEmpty() ? -1 : st.peek();
    }
    
    public int getMin() {
        return minSt.isEmpty() ? -1 : minSt.peek();
    }
}
