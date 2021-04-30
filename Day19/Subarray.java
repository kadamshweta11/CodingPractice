package Day19;

import java.util.Scanner;

public class Subarray {
 int maxSum(int[] arr,int n)
 {
	 int maxsum=0;
	 int currsum=0;
	 for(int i=0;i<n;i++)
	 {
		 currsum=currsum+arr[i];
		 if(currsum>maxsum)
		 {
			 maxsum=currsum;
		 }
		 if(currsum<0)
		 {
			 currsum=0;
		 }
		 
	 }
	 return maxsum;
 }
	public static void main(String[] args) {
		//Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Subarray a=new Subarray();
		System.out.println(a.maxSum(arr,n));

	}

	
}
