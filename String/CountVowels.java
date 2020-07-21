package string;

public class CountVowels {

	public static void main(String[] args) {
		String s="Himanshi";
		checkvowel(s);
	}

	public static void checkvowel(String s) { 
		int count=0;
		s=s.toLowerCase();
		System.out.println(s);
		
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{

				count++;
			}
		}
		System.out.println("Vowel count is "+count);
		System.out.println("Consonants count is "+(s.length()-count));
	}
}
