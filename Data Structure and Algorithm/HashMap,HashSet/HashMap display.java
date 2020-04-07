/******************************************************************************
Create a HashMap<String, String>, and add 10 string pairs:
watermelon - melon,
banana - fruit,
cherry - fruit,
pear - fruit,
cantaloupe - melon,
blackberry - fruit,
ginseng - root,
strawberry - fruit,
iris - flower,
potato - tuber.
Display the contents of the collection, each element on a new line.

*******************************************************************************/
import java.util.HashMap;

public class Main
{
public static void main(String[] args)
{
    HashMap<String,String> map= new HashMap<String,String>();
    map.put("watermelon","melon");
     map.put("banana", "fruit");
      map.put("cherry","fruit");
       map.put("pear","fruit");
        map.put("cantaloupe","melon");
         map.put("blackberry","fruit");
          map.put("ginseng","root");
           map.put("strawberry","fruit");
            map.put("iris","flower");
             map.put("potato","tuber");
    
    for(HashMap.Entry<String,String> pair: map.entrySet()){
        String key=pair.getKey();
        String value=pair.getValue();
        System.out.println(key +"-"+value);
        
    }
        
}	
}
