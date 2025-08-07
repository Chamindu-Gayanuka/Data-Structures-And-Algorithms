import java.util.Collections;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // To get in ascending order
        // Queue<Double> priorityQueue = new java.util.PriorityQueue<>();

        // To get in descending order
        Queue<Double> priorityQueue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        // Average marks of students in a class
        priorityQueue.offer(60.3);
        priorityQueue.offer(50.3);
        priorityQueue.offer(36.6);
        priorityQueue.offer(70.6);
        priorityQueue.offer(90.3);
        priorityQueue.offer(10.5);

        // Print the average marks in descending order
        while (!priorityQueue.isEmpty()) {
            System.out.println("Average mark: " + priorityQueue.poll());
        }
    }
}
