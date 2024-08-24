class MyStack {
    Queue<Integer> main;
    Queue<Integer> temp;

    public MyStack() {
        main = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        while(main.size() != 0){
            temp.offer(main.poll());
        }
        main.offer(x);
        while(temp.size() != 0){
            main.offer(temp.poll());
        }
    }
    
    public int pop() {
        return main.poll();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.size() == 0;
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