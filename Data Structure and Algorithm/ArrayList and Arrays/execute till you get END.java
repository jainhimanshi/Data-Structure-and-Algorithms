/******************************************************************************

Create a list of strings.
Enter strings from the keyboard and add them to the list.
Enter strings from the keyboard until the user enters "end". The string "end" is ignored.
Display the strings on the screen, each on a new line
*******************************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
     
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
        ArrayList<String> list = new ArrayList<String>();
        String s="co";
        
     while(!s.equals("end")){
         s=reader.readLine();
         if(s.equals("end")){
             break;
         }
        list.add(s);
     }
       
      for(int k=0;k<list.size();k++){
          System.out.println(list.get(k));
      }
    }
}