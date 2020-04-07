/******************************************************************************
How can a given string be reversed using recursion?
input=abcde
output=edcba
*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    String s=scan.nextLine();
	   String REV= other(s);
	   System.out.print(REV);
	}

     public static String other(String s){
      if (s.isEmpty()){
         return s;
        }
        return other(s.substring(1)) + s.charAt(0);
     }
}


  /* using reverse method :
  public static void reversestr(String input){
	    StringBuffer sb=new StringBuffer(input);
	   sb.reverse();
	System.out.println(sb);
	}*/
