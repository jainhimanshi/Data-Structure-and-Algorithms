package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
		String s=scan.next();
		DuplicateCharacter(s);
	}
	
	public static void  DuplicateCharacter(String s) {
		char [] arr=s.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int count=1;
		for (int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				count=map.get(arr[i]);
				map.put(arr[i],count+1);
			}
			else
			map.put(arr[i],count);
		}
		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}	
	}
    
}
