package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AnagramStringCheck {

	public static void main(String[] args) {
		String s1= "hima";
		String s2="mahi";	
		checkAnagram(s1,s2);
	}
	
	public static void checkAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			System.out.print("No");
		else {
			char [] arr1=s1.toCharArray();
			char[] arr2=s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			
			for(int i=0;i<s2.length();i++) {
				if(arr1[i]!=arr2[i])
					System.out.print("no");
				
			}	
			}
		}
	}

