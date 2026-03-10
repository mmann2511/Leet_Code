class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2; 

    public MyQueue() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        // FIFO not LIFO, so if push 1,2,3 -> need to pop bottom of stack (1)
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop()); // 3,2,1 top
        }

        int bottom = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); // bottom 2, 3 top
        }    

        return bottom;
    }
    
    public int peek() {
        // FIFO not LIFO, so if push 1,2,3 -> need to pop bottom of stack (1)
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop()); // 3,2,1 top
        }

        int top = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); // bottom 2, 3 top
        }
        return top;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
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