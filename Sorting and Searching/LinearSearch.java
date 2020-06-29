package searching;

import java.util.Scanner;

//linear search = return 1 if element found else 0.
//input={1,2,4,3},x=4
//out=1
public class LinearSearch {

	public static void main(String[] args) {
		int [] arr= {1,2,4,3};
		
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
	
		int result=Linearsearch(arr,x);
		System.out.println(result);

	}

	public static int Linearsearch(int[] arr, int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x)
				return 1;}
		return 0;
	}

}
