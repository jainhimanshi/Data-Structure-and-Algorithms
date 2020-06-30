package sorting;

import java.util.Arrays;

//
public class Quicksort {

	public static void main(String[] args) {
		int [] arr= {4,2,1,3};
		int start=0;
		int end=arr.length-1;
		int [] brr=quicksort(arr,start,end);
		System.out.print(Arrays.toString(brr));

	}

	public static int[] quicksort(int[] arr,int start,int end) {
		if(start==end)
			return arr;
		else {
			int partition = partitionalgo(arr,start,end);
			if(partition-1>start)
				quicksort(arr, start,partition-1);
			if(partition+1<end)
				quicksort(arr, partition+1, end);
		return arr;
		}
	} 
	
	public static int partitionalgo(int[] arr,int start,int end) {
		int pivot=arr[start];
		int i=start;
		for(int j=start+1;j<=end;j++) {
			if(pivot>=arr[j]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}}
			int temp2=arr[start];
			arr[start]=arr[i];
			arr[i]=temp2;
		return i;
	}
}
