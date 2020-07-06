package queue;

public class EnqueueAndDequeueUsingArray {
	
	int front=-1;
	int rear=-1;
	int MAX=1000;
	
	int [] arr=new int[MAX];

	public static void main(String[] args) {
		EnqueueAndDequeueUsingArray queue=new EnqueueAndDequeueUsingArray();
	     queue.Enqueue(3);
	     queue.Enqueue(4);
	     queue.Enqueue(1);
	     int n=queue.Dequeue();
	     System.out.println(n+" is dequeued from queue.");
	     System.out.println(queue.Dequeue()+" is dequeued from queue.");
	     System.out.println(queue.Dequeue()+" is dequeued from queue.");
	     System.out.println(queue.Dequeue());
    }
	 /*3 case  possible :
	  * case 1: when queue overflow (rear>=MAX-1)
	  * case 2: when no elementi.e empty (rear==-1)
	  * case 3: when already elements present (rear<MAX-1)
	  * */
	
	public void Enqueue(int n) {
		if(rear==MAX-1) {
			System.out.println("Queue overflow");}
		else {
			if(rear==-1) {
			rear++;
			front++;
			arr[rear]=n;
			System.out.println(n+" is enqueued in the queue");
			}
			else {
				rear++;
				arr[rear]=n;
				System.out.println(n+" is enqueued in the queue");
			}
		}
	}
	
	public  int Dequeue() {
		/*cases :
		 * case 1:empty queue (front==-1)queue underflow.
		 * case 2 : when elements are there(front<rear)
		 * */
		if(front==-1) {
			System.out.print("queue underflow");
			return -1;
		}
		else {
			int temp =arr[front];
			if(front==rear)
				front=rear=-1;
			else
			front++;
			return temp;
		}
	}
}