class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int rear;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        rear = 0;

    }
    
    public void push(int x) {
        q1.offer(x);
        rear = x;
    }
    
    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int element = q1.poll();

        while (q2.size() > 0) {
            push(q2.poll());
        }

        return element;
        
    }
    
    public int top() {
        return rear;
    }
    
    public boolean empty() {
        if (q1.size() == 0) {
            return true;
        }
        return false;
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