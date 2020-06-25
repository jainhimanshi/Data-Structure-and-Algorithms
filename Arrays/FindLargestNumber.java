package array;

//arr= {3,1,5} ,out=5

public class FindLargestNumber {

	public static void main(String[] args) {
		int[] arr= {3,1,5};
		int n=arr.length;
		
		FindLargestNumber(arr,n);
	}
	
	public static void FindLargestNumber(int[] arr,int n) {
	int largest=arr[0];
	for(int i=1;i<n;i++) {
		if(arr[i]>largest)
			largest=arr[i];
	}
	System.out.print("largest number is "+largest);
	}
}
