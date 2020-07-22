package numbers;

import java.util.Scanner;
public class PrimeNumCheck {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		prime(n);
	}
	public static void prime(int n) {
		if(n==1) {
			System.out.println("Its neither prime nor composite ");
			return;
		}
		else {
		for(int i=2;i<n;i++) {
			if(n%i==0){
				System.out.println("Its not a prime number");
				return;}
		}
		System.out.println("Yes,Its a prime");
		}
	}
}
