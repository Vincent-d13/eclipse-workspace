package p3_priorityQueue;

public class DemoPQ {

	public static void main(String[] args) {

		PQueue pq = new PQueue(10);
		pq.insert(10);
		pq.insert(5);
		pq.insert(20);
		pq.insert(4);
		pq.insert(3);
		pq.insert(30);
		
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
