package Day47;

import java.util.Scanner;
//Given an array, find the number of subarrays whose sum is odd
public class Subarray {
static int count(int[] arr1,int n) {
	int res=0;
	for(int i=0;i<=n-1;i++) {
		int val=0;
		for(int j=i;j<=n-1;j++) {
			val=val+arr1[j];
			if(val%2!=0) {
				res++;
			}
		}
	}
	return (res);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("no of sub array with odd sum is=");
		System.out.println(count(arr1,n));
		sc.close();
	}

}
