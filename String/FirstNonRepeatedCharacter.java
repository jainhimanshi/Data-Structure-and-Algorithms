package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String s="himanshi";
		nonrepeatedchar(s);
	}

	public static void nonrepeatedchar(String s) {
		char[] arr=s.toCharArray();
		int count=1;
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				count=map.get(arr[i]);
				map.put(arr[i],count+1);
			}
			else
			map.put(arr[i],count);
		}
		
		for (Entry<Character,Integer>Entry:map.entrySet()) {
			if(Entry.getValue()==1) {
				System.out.print("First non repeated character is "+Entry.getKey());
				break;
			}
		}
	}
}
