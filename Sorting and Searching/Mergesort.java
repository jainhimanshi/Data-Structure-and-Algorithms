package sorting;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		int [] arr= {6,5,3,8};
		arr=mergesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] mergesort(int[] arr,int start,int end) {
		if(start==end)
			return arr;
		else {
			int mid=(start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1, end);
			mergealgo(arr,start,mid,end);
		}
		return arr;
	}
	public static void mergealgo(int [] arr,int start,int mid,int end) {
		int i=start;
		int j=mid+1;
		int p=0;
		int [] brr=new int[arr.length];
		
		while(i<=mid&&j<=end) {
			if(arr[i]<=arr[j]) {
				brr[p]=arr[i];
				i++;
				p++;
			}
			else {
				brr[p]=arr[j];
				p++;
				j++;
			}
		}
		while(i<=mid){
	         brr[p]=arr[i];
	         p++;
	         i++;
	     }
	     while(j<=end){
	         brr[p]=arr[j];
	         p++;
	         j++;
	     }
	     for(int k = start; k <= end; k++) 
	 		arr[k] = brr[k-start];
	} 

}
