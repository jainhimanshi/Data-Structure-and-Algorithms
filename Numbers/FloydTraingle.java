package numbers;

import java.util.Scanner;

public class FloydTraingle {

public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		traingle(n);
	}

	public static void traingle (int n) {
		int res=1;
		for(int i=1;res<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(res+++" ");
			}
			System.out.println();
		}
	}

}
