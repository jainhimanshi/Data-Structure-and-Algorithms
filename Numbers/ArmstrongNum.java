package numbers;

import java.util.Scanner;

public class ArmstrongNum {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(Armstrong(n));
	}
		public static boolean Armstrong(int n) {
			int copy=n;
			int result=0;
		  while(copy>0) {
			  int digit=copy%10;
			  result=result+(digit*digit*digit);
			  copy=copy/10;
		  }
		  if(result==n)
			  return true;
		  else
			  return false;
		}
}
