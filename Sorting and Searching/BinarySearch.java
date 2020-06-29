package searching;

import java.util.Scanner;
//Binary search : if element found return its index,else return -1.

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {1,2,3,5};
		
		Scanner scan = new Scanner(System.in);
		int search=scan.nextInt();
		
        int result=BinarySearchalgo(arr,search,0,arr.length-1);
        if(result!=-1)
	     System.out.println("search element is present at index "+ result);
        else
        	System.out.println("element not found");
	}
       public static int BinarySearchalgo(int[] arr,int search,int start,int end){
    	   
    	 if(start==end) {
            if(arr[start]==search)
            	return start;}
         else {
        	 int mid=(start+end-1)/2;
        	 if(arr[mid]==search)
        		 return mid;
        	 else if (arr[mid]<search)
        		 return BinarySearchalgo(arr, search,mid+1, end);
        	 else
        		 return BinarySearchalgo(arr, search, start,mid-1);
         }
    	 return -1;
       }

}
