package test_package1;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new PriorityQueue<>();

		queue.add("Groot");
		queue.add("Starlord");
		queue.add("Nebula");

		System.out.println("Orginal queue: " + queue);

		queue.remove();
		System.out.println("After removing: " + queue);

		String head = queue.peek();
		System.out.println("The head is: " + head);

		head = queue.poll();
		System.out.println("Removed head: " + head);

		System.out.println("Present queue: " + queue);

	}

}
