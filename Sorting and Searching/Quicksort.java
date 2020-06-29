package sorting;

import java.util.Arrays;

//Quicksort :

public class Quicksort {

	public static void main(String[] args) {
		   int[] arr={10,16,8,12,15,6,3,9,5};
		  arr= sort(arr,0,arr.length-1);
		  System.out.println(Arrays.toString(arr));
		}
		
		public static int[] sort(int[] arr,int start,int end){
		    int partition=findpartition(arr,start,end);
		    System.out.println(partition);
		    System.out.println(Arrays.toString(arr));
		    
		      if(partition-1>start) {
	            sort(arr, start, partition - 1);
	        }
	        if(partition+1<end) {
	            sort(arr, partition + 1, end);
		     }
		 return arr;
		}
		
		public static int findpartition(int[] arr,int start,int end){
	        int pivot = arr[start];
	        int i=start;
	        for(int j=start+1; j<=end; j++){
	             if(arr[j]<=pivot){
	                i++;
	                int temp= arr[j];
	                arr[j]=arr[i];
	                arr[i]=temp;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[start];
	        arr[start] = temp;
	 
	        return i;
	    }

}
