package stack;

public class PushPopUsingArray {
	
	int top=-1;
	int MAX=100;
	int[] stackarr=new int[MAX];

	public static void main(String[] args) {
		PushPopUsingArray obj=new PushPopUsingArray();
		obj.push(3);
		obj.push(5);
		obj.push(1);
		System.out.println(obj.top);
		obj.pop();
		obj.pop();
		obj.pop();
		System.out.println(obj.top);
		obj.pop();
	}
	
	public void push(int d) {
		//if stack is full them top=max-1
				if (top==MAX-1) {
					System.out.println("stack overflow");
				}
				else  {
			top++;
			stackarr[top]=d;
			System.out.println(d+" is pushed into stack");
			}
	}
	
	public int pop() {
		int temp=0;
		////if stack empty then top==-1
		if(top==-1)
			System.out.println("stack underflow");
		else {
		   temp=stackarr[top];
		   top--;
		   System.out.println(temp+" is poped from stack.");
		}
		return temp;
	}

}
