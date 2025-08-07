import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Enqueuing elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        // Displaying the queue
        System.out.println("Is the queue empty? (after enqueue elements) " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue: " + queue);

        // Dequeue elements
        queue.poll();
        queue.poll();
        System.out.println("Queue after dequeue: " + queue);

        /*
        // Containing elements
        System.out.println("Does the queue contain 30? " + queue.contains(30));
        System.out.println("Does the queue contain 100? " + queue.contains(100));
         */

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());
    }
}
