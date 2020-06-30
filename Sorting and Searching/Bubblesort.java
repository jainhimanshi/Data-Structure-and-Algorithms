package sorting;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr= {5,1,4,2,8};
		int n=arr.length;
     	int [] brr=bubblesort(arr,n);
     	System.out.print(Arrays.toString(brr));
	}
     public static int[] bubblesort(int [] arr,int n) {
    	if(n==1)
    		return arr;
    	else {
    		 for(int j=0;j<arr.length-1;j++) {
    			 if(arr[j+1]<arr[j]) {
    				 int temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    			 }
    		 }
    		 System.out.print("Iteration");
    		 System.out.println(Arrays.toString(arr));
    		 bubblesort(arr,n-1); 
    	}
    	return arr;
     }
    }