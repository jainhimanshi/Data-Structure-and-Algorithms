package string;

public class RotationCheck {

	public static void main(String[] args) {
		String s1="AACD";
		String s2="ACDA";
		
		rotation(s1,s2);

	}
	
	public static void rotation(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("no");
			return;
		}
		else
		{
			String s=s1.concat(s1);
			if(s.contains(s2))
				System.out.println("yes");
		}
	}

}
