package stack;

public class PushAndPopUsingLL {
	
	Node head; 
	  
    static class Node { 
        int data; 
        Node next; 
  
        Node(int data) 
        { 
            this.data = data; 
        } 
    } 
    public void push(int data) 
    { 
        Node newNode = new Node(data); 
            newNode.next = head; 
            head = newNode; 
        System.out.println(data + " pushed to stack");
    }
    public void pop(){
    	int x=0;
        if(head==null){
            System.out.println("stack underflow");
        }
        else{
             x=head.data;
            head=head.next;
            System.out.println(x+"popped from stack");
        }
      
    }
    public void peek(){
        if(head==null)
        {
             System.out.print("stack underflow");
        }
        else {
        System.out.print(head.data);}
    }
  
    public static void main(String[] args) 
    { 
  
        PushAndPopUsingLL sll = new  PushAndPopUsingLL(); 
               sll.push(10); 
               sll.push(20); 
               sll.push(30); 
               //System.out.println();
               sll.peek();
              System.out.println();
               sll.pop();
               sll.pop();
               sll.pop();
               System.out.println();
               sll.peek();
      
       
    } 
} 