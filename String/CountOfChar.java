package string;
import java.util.*;
import java.util.Map.Entry;

public class CountOfChar {

	public static void main(String[] args) {
		String s ="HimanSHI";
		s=s.toLowerCase();
		char c='i';

		countofchar(s,c);
	}

	public static void countofchar(String s,char c) {
		int count=1;
		
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char temp=s.charAt(i);
			if(map.containsKey(temp)) 
			{
				count=map.get(temp);
				map.put(temp,count+1);
			}
			else
			map.put(temp,count);
		}
		
		for(Entry<Character,Integer>Entry:map.entrySet()) {
			if(Entry.getKey()==c)
				System.out.println("Count of "+c+" is "+Entry.getValue());
		}
	}
}
