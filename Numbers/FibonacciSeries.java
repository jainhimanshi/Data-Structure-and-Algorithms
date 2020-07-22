package numbers;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fibonacci(n));
	}
	

        public static int fibonacci(int n) {
        	if(n==0||n==1)
        		return n;
        	else {
        		return fibonacci(n-1)+fibonacci(n-2);
        	}
        }
}
