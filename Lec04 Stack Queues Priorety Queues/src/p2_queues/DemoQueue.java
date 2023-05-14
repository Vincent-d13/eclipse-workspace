package p2_queues;

import java.util.Arrays;

public class DemoQueue {

	public static void main(String[] args) {

		Queue myQue = new Queue(5);
		myQue.add(10);
		myQue.add(20);
		myQue.add(30);
		myQue.add(40);
		myQue.add(50);
		System.out.println(myQue.remove());
		System.out.println(myQue.remove());
		myQue.add(60);
		System.out.println();
		
		while (!myQue.isEmpty()) {
			System.out.println(myQue.remove());
		}
	}

}
