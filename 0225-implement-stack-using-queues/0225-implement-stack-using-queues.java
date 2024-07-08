class MyStack {
    int top;
    ArrayList<Integer> list;

    public MyStack() {
        top = -1;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        top++;
        list.add(x);
    }
    
    public int pop() {
        int value = list.remove(top);
        top--;
        return value;
    }
    
    public int top() {
        return list.get(top);
    }
    
    public boolean empty() {
        return top == -1 ? true : false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */