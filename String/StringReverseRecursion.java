package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringReverseRecursion {

	public static void main(String[] args) {
		String s="hima jain";
		//reverse given string
		swaprecursive(s.toCharArray(),0,s.length()-1);
		//using library function - Collections.reverse
		rev(s);
	}
	
	public static void swaprecursive(char[] arr,int start,int end){
		if(start>=end) { 
			System.out.println(arr);
			return ;
			}
		else {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			//System.out.println(arr);
			swaprecursive(arr,start+1,end-1);
		}
	}
	
	public static void rev(String s) {
		ArrayList<Character>list=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		list.add(s.charAt(i));
		Collections.reverse(list);
		System.out.println(list);
	}

}
