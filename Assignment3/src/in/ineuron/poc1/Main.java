package in.ineuron.poc1;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);  // Create a stack with maximum size of 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());

	}

}
