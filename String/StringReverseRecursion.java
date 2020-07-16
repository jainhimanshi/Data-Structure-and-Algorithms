package string;

import java.util.Arrays;

public class StringReverseRecursion {

	public static void main(String[] args) {
		String s="himan";
		//print reversed string
		strreverse(s);
		//reverse given string
		swaprecursive(s.toCharArray(),0,s.length()-1);
	}
	
	public static String strreverse(String s) {
		if (s.length()<=1) 
			return s;
		else
		{
			System.out.print(s.charAt(s.length()-1));
			return strreverse(s.substring(0,s.length()-1));
		}
	}
	
	public static void swaprecursive(char[] arr,int start,int end){
		if(start==end) { 
			System.out.print(String.copyValueOf(arr));
			return ;}
		else {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			swaprecursive(arr, start+1, end-1);
		}
	}

}
