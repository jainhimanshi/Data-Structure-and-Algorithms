package array;

import java.util.Arrays;
import java.util.Collections;

//reverse an array 
//input =2,1,3
//output=3,1,2

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr= {2,1,3};
		reversearray(arr,0,arr.length-1);
        revarrayusingcollections(arr);  // reverse element using collections.reverse
		
	}
    public static void reversearray(int [] arr,int start,int end) {
    	
    	for(int i=0;i<arr.length/2;i++) {
    		int temp=arr[i];
    		arr[i]=arr[arr.length-1-i];
    		arr[arr.length-1-i]=temp;
    	}
    	System.out.print(Arrays.toString(arr));
    }
    
    /*function reverses the elements of the array*/
    static void revarrayusingcollections(int a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.toString(a)); 
    } 
  
}
