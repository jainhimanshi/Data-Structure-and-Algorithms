package array;

//given integer array .find all pair of number whose sum equal  to given number.

public class PairwhoseSumEqualNumber {

	public static void main(String[] args) {
		int [] arr= {2,4,6,12,14,19};
		int sum=18;
		
		checkpairsum(arr,sum);
	}
	
	static void checkpairsum(int [] arr,int sum) {
		int a=0;
		int b=arr.length-1;
		
		while(a<b) {
		if(arr[a]+arr[b]==sum)
		{
          System.out.println("the pair are "+arr[a]+","+arr[b]);
          a++;
          b--;
		}
		else if(arr[a]+arr[b]>sum)
		b--;
		else
		a++;
		}
	}
}
