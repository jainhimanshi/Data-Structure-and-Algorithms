package string;

public class PermutationsOfString {

	public static void main(String[] args) {
		
		String s="abc";
		String ans="";
		permutations(s,ans);

	}

	public static void permutations(String s,String ans) {
		
		if(s.length()==0) {
			 System.out.println(ans + " "); 
	            return; 
		}
	
		for(int i=0;i<s.length();i++) {
			//fixing ith character
			char ch=s.charAt(i);
			//rest of string
			String ros=s.substring(0,i)+s.substring(i+1);
		
			permutations(ros,ans+ch);
		}
	}
}
