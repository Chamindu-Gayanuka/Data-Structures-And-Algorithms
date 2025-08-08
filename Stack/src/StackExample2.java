public class StackExample2 {
    int arr[];
    int top;
    int maxSize;

    StackExample2(int size) {
        maxSize = size;
        arr = new int[size];
        top = -1; // Stack is initially empty
    }

    // Is the stack full?
    boolean isFull() {
        return (top + 1 == maxSize);
    }

    // Is the stack empty?
    boolean isEmpty() {
        return (top == -1);
    }

    // Push an element onto the stack
    void push(int x) {
        if (isFull()){
            System.out.println("Stack is full.");
        }
        else {
            top++;
            arr[top] = x;
//            System.out.println("Pushed " + x);
        }
    }

    // Pop an element from the stack
    void pop() {
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            top--;
            System.out.println("Popped element");
        }
    }

    // Print the stack
    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println("stack value " + arr[i]);
        }
    }

    public static void main(String[] args) {
        StackExample2 myStack = new StackExample2(5);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + myStack.isEmpty());

        // Push elements onto the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.printStack();

        // Pop elements from the stack
        myStack.pop(); // Pops 50
        myStack.pop(); // Pops 40
        myStack.push(60);

        myStack.printStack();
    }
}
