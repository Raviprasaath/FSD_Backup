package Queue;



class Queue {
    private int front, rear, capacity;
    private int queue[];
 
    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void queueEnqueue(int data) {
        if (capacity == rear) {
            System.out.print("Queue is full");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }
 
    public void queueDequeue() {
        if (front == rear) {
            System.out.print("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
        if (rear < capacity)
            queue[rear] = 0;
            rear--;
        }
        return;
    }
    
    public void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.print("Queue is Empty");
            return;
        }
 
        for (i = front; i < rear; i++) {
            System.out.print(queue[i]);
        }
        return;
    }

    public void queueFront() {
        if (front == rear) {
            System.out.print("Queue is Empty");
            return;
        }
        System.out.print(queue[front]);
        return;
    }
}

public class ImplementingQueuByArray {
    
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.queueDisplay();
 
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
 
        q.queueDisplay();
 
        q.queueEnqueue(60);
 
        q.queueDisplay();
 
        q.queueDequeue();
        q.queueDequeue();
 
        q.queueDisplay();
 
        q.queueFront();
    }
}
