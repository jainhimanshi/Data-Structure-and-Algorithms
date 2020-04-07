/******************************************************************************

You need to create a Set<String> and add 20 words that start with the letter "L".
*******************************************************************************/
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static Set<String> createSet() {
         HashSet<String> s1=new HashSet<String>();
	    for(int i=0;i<20;i++)
	    s1.add("L"+i);
	    return s1;
    }

    public static void main(String[] args) {
      //HashSet<String> s1=new HashSet<String>();
      createSet();
        //for(String txt:s)
		//System.out.println(txt);
    }
}
