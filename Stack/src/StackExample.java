import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Displaying the stack
        System.out.println("Is stack empty? (after push elements) " + stack.isEmpty());
        System.out.println("Stack: " + stack);

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // Peeking at the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());
    }
}
