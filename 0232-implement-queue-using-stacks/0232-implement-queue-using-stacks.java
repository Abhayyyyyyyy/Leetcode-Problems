class MyQueue {
    int front;
    int rear;
    ArrayList<Integer> list;
    public MyQueue() {
        front = rear = -1;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        rear++;
        list.add(x);
    }
    
    public int pop() {
        front++;
        return list.get(front);
    }
    
    public int peek() {
        return list.get(front + 1);
    }
    
    public boolean empty() {
        return front == rear ? true : false;
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