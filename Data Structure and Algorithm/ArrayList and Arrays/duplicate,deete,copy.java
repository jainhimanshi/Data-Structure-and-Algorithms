/******************************************************************************

1. Create a list of words and populate it yourself.
2. The fix method should:
2.1. remove all words containing the letter "r" from the list
2.2. duplicate all words containing the letter "l".
2.3. if a word contains both "r" and "l", then leave it unchanged.
2.4. don't do anything to other words.

*******************************************************************************/
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("him");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
         ArrayList<String> list1 = new ArrayList<String>();
         
       //  list1.addAll(list);
         
     for(int i=0;i<list.size();i++){
     String s=list.get(i);
     
      if(s.contains("r")&& !s.contains("l")){
         //System.out.println("r is there");
         list1.remove(s);
     }
      else if(s.contains("l")&& !s.contains("r")){
         //Sstem.out.println("l is there"
    list1.add(s);
    list1.add(s);
    }
     else if((s.contains("r"))&&(s.contains("l"))){
      list1.add(s);
     }
     else
     list1.add(s);
    }
    return list1;
    }
}