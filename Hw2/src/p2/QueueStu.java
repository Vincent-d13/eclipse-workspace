package p2;

public class QueueStu {

		// if data is bigger the efficiency wont change from constant  -- loop gives you more like O(n) -- nested loop O(n^2)
		private Student [] queArray;
		private int front;
		private int rear;
		private int maxSize = 5;
		private int nElems;
		private Student [] waitLsit;
		
		
		public QueueStu () {
			queArray = new Student[5];
			this.maxSize = maxSize;
			front = 0;
			rear = -1;
			nElems = 0;
		}
		
		public Student remove() {
			
			Student temp = queArray[front++];
			if(front == maxSize) {
				front = 0;
			}
			nElems --;
			return temp;
		}
		
		public void add(Student value) {
			if(rear == maxSize - 1) {
				rear = -1;
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


