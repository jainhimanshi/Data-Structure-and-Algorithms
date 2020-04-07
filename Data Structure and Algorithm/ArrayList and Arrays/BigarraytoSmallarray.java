import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    int biggarr []=initialisearray();
	   int firstarr[]=firstarrelements(biggarr);
	   int secondarr[]=secondarrelements(biggarr);
	   
	  for(int i=secondarr.length-1;i>=0;i--){
	      System.out.println(secondarr[i]);}
	    
	}
	    
	    public static int[] initialisearray() throws IOException {
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	   // int n=Integer.parseInt(bf.readLine());
	    int [] arr=new int [10];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=Integer.parseInt(bf.readLine());
	    }
	    return arr;
	    }
	    
	    public static int[] firstarrelements(int [] array){
	    int firstarr1[]=new int[5]; 
	    for(int i=0;i<array.length/2;i++){
	            firstarr1[i]=array[i];
	    }
	    return firstarr1;
	}
		    public static int[] secondarrelements(int [] array){
		        int secondarr1[]=new int[5];
	    for(int i=array.length/2;i>0;i--){
	            secondarr1[i-1]=array[array.length-i];
	    }
	    return secondarr1;
	}
}
