/******************************************************************************
How do you reverse an array in place in Java?
*******************************************************************************/
import  java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     Scanner scan=new Scanner(System.in);
     
      int n=scan.nextInt();
      
     for(int i=0;i<n;i++){
         list.add(scan.nextInt());
     }
      
      for(int i=0;i<list.size()/2;i++){
          int temp=list.get(list.size()-i-1);
          list.set((list.size()-i-1),list.get(i));
          list.set(i,temp);
      }
    for(int k=0;k<list.size();k++){
        System.out.print(list.get(k)+" ");
    }
	
	}
}

/******************************************************************************
How do you reverse an array in Java?
*******************************************************************************/
import  java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     Scanner scan=new Scanner(System.in);
     
      int n=scan.nextInt();
      
     for(int i=0;i<n;i++){
         list.add(scan.nextInt());
     }
      ArrayList<Integer> newlist=new ArrayList<Integer>();
      
      for(int i=0;i<list.size();i++)
      newlist.add(list.get(list.size()-i-1));
     
      
    
    for(int k=0;k<newlist.size();k++){
        System.out.print(newlist.get(k)+" ");
    }
	
	}
}

/******************************************************************************
How do you reverse an array in Java using collection method?
*******************************************************************************/
import  java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     Scanner scan=new Scanner(System.in);
     
      int n=scan.nextInt();
      
     for(int i=0;i<n;i++){
         list.add(scan.nextInt());
     }
      
     Collections.reverse(list);
      
    
    for(int k=0;k<list.size();k++){
        System.out.print(list.get(k)+" ");
    }
	
	}
}
