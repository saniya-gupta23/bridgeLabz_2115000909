import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    
    public void enqueue(int item) {
        stack1.push(item);
    }

    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1; 
        }
        
        if (stack2.isEmpty()) {
            
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop(); 
    }

  
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1; 
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek(); 
    }

    
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Front: " + queue.peek()); 
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); 
    }
}
