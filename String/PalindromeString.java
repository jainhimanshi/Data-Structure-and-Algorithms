package string;

public class PalindromeString {

	public static void main(String[] args) {
		String s= "hiah";
		char[] brr=palindromcheck(s.toCharArray(),0,s.length()-1);
		System.out.println(brr);
		
		String rev=String.copyValueOf(brr);
		System.out.println(rev);
		
        if(rev.equals(s))
		System.out.println("Yes,Its a palindrome. ");
        else
        	System.out.println("No,Its not  a palindrome. ");
        
        //iterative approach 
        palindromeswapcheck(s);
	}

	//recursive approach
	public static char[] palindromcheck(char[] arr,int start,int end){
		if(start>=end) { 
			//System.out.println(arr);
			return arr;
			}
		else {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			//System.out.println(arr);
			return palindromcheck(arr,start+1,end-1);
		}
	}
	
	//iterative approach 
	public static void  palindromeswapcheck(String s) {
		for(int i=0;i<=s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				System.out.println("No,Its not a palindrome");
				return ;}
		}
		System.out.println("Yes,Its a palindrome");
	}
}
