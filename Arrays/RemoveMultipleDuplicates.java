package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

//remove multiple duplicates in an array.

public class RemoveMultipleDuplicates {

	public static void main(String[] args) {
      
		int arr[]= {2,4,1,4,2};
		int n=arr.length;
		remduplicate(arr,n);
		remwithoutusinglib(arr);
	}

	public static void remduplicate(int [] arr,int n) {  //using library function
		ArrayList list=new ArrayList(n);
		
		for(int x=0;x<n;x++)
		list.add(arr[x]);
		System.out.println(list);
		
		LinkedHashSet set=new LinkedHashSet();
		set.addAll(list);
		System.out.println(set);
	}
}
