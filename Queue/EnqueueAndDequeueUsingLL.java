package queue;

public class EnqueueAndDequeueUsingLL {
	
	Node head;
	Node front;
	Node rear;
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}

	public static void main(String[] args) {
		EnqueueAndDequeueUsingLL queue=new EnqueueAndDequeueUsingLL();
		queue.Enqueue(3);
		queue.Enqueue(4);
		queue.Enqueue(1);
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
	}
	
	public void Enqueue(int d) {
		Node newnode=new Node(d);
		
		if(front==null&& rear==null) {
			front=newnode;
		    rear=newnode;
		    System.out.println(d+" enqueued");
	    }
	   else {
		   rear.next=newnode;
		   rear=newnode;
		   System.out.println(d+" enqueued");
	   }
     }
	
	public int Dequeue() {
		// If queue is empty, return NULL. 
        if (front == null) {
        	System.out.println("queue underflow");
            return -1; }
  
        // Store previous front and move front one node ahead 
        int temp = front.data; 
        front = front.next; 
  
        // If front becomes NULL, then change rear also as NULL 
        if (front == null) 
            rear = null; 
        
        System.out.println(temp+" is dequeued");
        return temp;
    } 
} 
	
	
