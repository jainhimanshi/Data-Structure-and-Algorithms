package numbers;

import java.util.Scanner;

public class SwapVariable {
public static void main(String[] args) {
		
	int n1;
	int n2;
	
		Scanner scan = new Scanner(System.in);
		n1=scan.nextInt();
		n2=scan.nextInt();
		swapusingtemp(n1,n2);
		swapwithouttemp(n1,n2);
	}
        public static void swapusingtemp(int n1,int n2) {
        	int temp=n1;
        	n1=n2;
        	n2=temp;
        	System.out.println("n1 is "+n1+" "+"n2 is "+n2);
        }
        
        public static void swapwithouttemp(int a,int b) {
        	a=a+b;
        	b=a-b;
            a=a-b;
        	System.out.println("n1 is "+a+" "+"n2 is "+b);
        }


	
}
