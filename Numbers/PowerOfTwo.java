package numbers;

import java.util.Scanner;

public class PowerOfTwo {
	
public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(power(n));
	}
		public static int power(int n) {
			int count=0;
			if(n%2!=0)
				return -1;
			else {
				while(n>1) {
				n=n/2;
				count++;
				}
			}
			return count;
		}
}
