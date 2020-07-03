package sorting;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		int [] arr= {5,4,3,6,1};
		int n=arr.length;
		insertionsort(arr,0,arr.length-1);
	}
   public static void insertionsort(int[] arr,int start,int end) {
	   
	   for(int i=start+1;i<=end;i++) {
		   int key=arr[i];
		   int j=i-1;
		   
		   while(j>=0&&arr[j]>key) {
			   arr[j+1]=arr[j];
			   j--;
		   }
		   arr[j+1]=key;
	   }
	   System.out.print(Arrays.toString(arr));
   }
}
