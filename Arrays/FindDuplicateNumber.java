package array;
import java.util.Scanner;

//given int array=[1,3,2,3] ,output=3

public class FindDuplicateNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] arr= {1,3,2,3};	
		int arr_size=arr.length;	
		findduplicate(arr,arr_size);
	}
	
	public static void findduplicate(int[] arr,int size) {
		
	        int count[] = new int[size];
	    
	        for (int i = 0; i < size; i++)  
	        { 
	        	int x=arr[i];
	            if (count[x] == 1) 
	                System.out.print(arr[i] + " "); 
	            else
	                count[x]++; 
	        } 
	    } 
	  
	   
	} 
