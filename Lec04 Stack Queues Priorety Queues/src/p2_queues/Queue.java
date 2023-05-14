package p2_queues;

public class Queue { /*Abstract Data Type First in first out FIFO
	if data is bigger the efficiency wont change from constant  -- loop gives you more like O(n) -- nested loop O(n^2)
	insert only rear gets touched and remove only front gets touched 
	when full rear is -1
	*/
	private long [] queArray;
	private int front;
	private int rear;
	private int maxSize;
	private int nElems;
	
	public Queue (int maxSize) {
		queArray = new long[maxSize];
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		nElems = 0;
	}
	
	public long remove() {
		
		long temp = queArray[front++];
		if(front == maxSize) {
			front = 0;
		}
		nElems --;
		return temp;
	}
	
	public void add(long value) {
		if(rear == maxSize - 1) {
			rear = -1; //wrap around 
		}
		queArray[++ rear] = value;
		nElems++;
	}
	
	public boolean isEmpty () {
		return nElems == 0;
		
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	

}
