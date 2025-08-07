import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        /*
        // Use as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        // Print the stack
        System.out.println(linkedList);

        // Pop an element from the stack
        linkedList.pop();
        System.out.println(linkedList);
        */

        // Use as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        // Print the queue
        System.out.println(linkedList);

        // Add an element
        linkedList.add(4, "E");
        System.out.println(linkedList);

        // Remove an element
        linkedList.remove("F");
        System.out.println(linkedList);

        // Poll an element from the queue
        linkedList.poll();
        System.out.println(linkedList);
    }
}
