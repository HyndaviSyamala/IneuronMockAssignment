package in.ineuron.poc1;

public class Stack {
	private int maxSize;       // Maximum size of the stack
    private int[] stackArray;  // Array to hold the stack elements
    private int top;           // Index of the top element in the stack

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initialize the top index to -1 (empty stack)
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    // Method to pop and remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedValue = stackArray[top];
        top--;
        return poppedValue;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to get the top element without removing it from the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }
}
