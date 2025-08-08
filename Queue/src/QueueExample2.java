public class QueueExample2 {
    int front, rear, maxSize;
    int queArr[];

    QueueExample2(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queArr = new int[size];
    }

    // Is the queue full?
    boolean isFull() {
        return  (rear + 1 == maxSize);
    }

    // Is the queue empty?
    boolean isEmpty() {
        return (front > rear);
    }

    // Enqueue an element
    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            rear++;
            queArr[rear] = x;
        }
    }

    // Dequeue an element
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            front++;
        }
    }

    // Print the queue elements
    void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queArr[i]);
        }
    }

    public static void main(String[] args) {
        QueueExample2 myQueue = new QueueExample2(5);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.printQueue();
        myQueue.enqueue(60); // This will show "Queue is full."
    }
}
