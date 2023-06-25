package in.ineuron.poc2;

public class Main {

	public static void main(String[] args) {
		 Queue queue = new Queue();

	        queue.enqueue(50);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        System.out.println("Front element: " + queue.peek());

	        System.out.println("Dequeued element: " + queue.dequeue());
	        System.out.println("Dequeued element: " + queue.dequeue());

	        System.out.println("Is queue empty? " + queue.isEmpty());

	}

}
