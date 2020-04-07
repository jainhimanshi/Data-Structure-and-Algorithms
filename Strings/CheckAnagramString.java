2-How do you check if two strings are anagrams of each other?(same characters but order can be different)
input1=abcd input2=cdab 
output=yes

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String input1=s.nextLine();
	    String input2=s.nextLine();
	    
	    for(int i=0;i<input1.length();i++){
	        for(int j=0;j<input2.length();j++){
	            if( input1.charAt(i)==input2.charAt(j)){
	            break;
	            }
	            else
	            System.out.println("not anagrams");
	        }
	        }
	       
	    }
	}
