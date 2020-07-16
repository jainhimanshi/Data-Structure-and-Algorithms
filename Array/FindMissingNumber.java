package array;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;


//if more than one number missing,we will use bitset class.

public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int totalcount=scan.nextInt();
		int []arr= {1,2,3,4,6,9,8};
		
		missingnumber(arr,totalcount);
	}
	
	public static void missingnumber(int[] arr,int totalcount) {
		
		int missingcount=totalcount-arr.length;  // know no of msising elements.
		BitSet bitset=new BitSet(totalcount);
		
		for(int i:arr) {
			bitset.set(i-1);}
		
		System.out.printf("Missing numbers in integer array %s, "
		+ "with total number %d is ",Arrays.toString(arr),totalcount);
		    
		int Missing = 0;

		 for (int i = 0; i < missingcount; i++) {
		 Missing = bitset.nextClearBit(Missing);
		 System.out.println(++Missing);
		}
}		
}
