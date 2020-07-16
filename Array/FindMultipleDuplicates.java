package array;

import java.util.HashMap;
import java.util.Map; 
import java.util.Map.Entry; 

public class FindMultipleDuplicates {

	public static void main(String[] args) {

		int arr[]= {2,4,1,4,2};
		int n=arr.length;
	          printDuplicates(arr,n);

	}

          // function to find and print duplicates 
	    private static void printDuplicates(int[] arr, int n)  
	    { 
	        HashMap<Integer,Integer> map = new HashMap<>(); 
	        
	        int count = 0; 
	        
	         for(int i = 0; i < n; i++){ 
	            if(map.containsKey(arr[i])){ 
	                count = map.get(arr[i]); 
	                map.put(arr[i], count + 1); 
	            } 
	            else{ 
	                map.put(arr[i], 1); 
	            } 
	          } 
	          
	         for(Entry<Integer,Integer> entry : map.entrySet()) 
	         { 
	             // if frequency is more than 1 print the element 
	             if(entry.getValue() > 1){ 
	                 System.out.print(entry.getKey()+ " "); 
	             } 
	         } 		
	}

}
