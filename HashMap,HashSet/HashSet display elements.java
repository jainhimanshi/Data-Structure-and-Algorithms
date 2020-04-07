/******************************************************************************
Create a HashSet with String elements.
Add 10 strings to it:
watermelon
banana
cherry
pear
cantaloupe
blackberry
ginseng
strawberry
iris
potato

Display the contents of the collection, each element on a new line.
Watch how the order of the entries has changed.


*******************************************************************************/
import java.util.HashSet;

public class Solution {
    public static void main(String[] args)
     {
 
    HashSet<String> s = new HashSet<String>();
    s.add("watermelon");
    s.add("banana");
    s.add("cherry");
    s.add("pear");
     s.add("cantaloupe");
      s.add("blackberry");
       s.add("ginseng"); 
       s.add("strawberry");
          s.add("iris");
         s.add("potato"); 
    
    for(String text: s)
        System.out.println(text);

    }
}
