package Day38;

import java.util.Scanner;

public class Kthelement2 {
	//Given an array arr[] and a number K where K is smaller than size of array, 
	//the task is to find the Kth largest element in the given array. It is given that all array elements are distinct.
	private static void kthelement(int[] arr, int i, int j, int k) {
		// TODO Auto-generated method stub
		for(int i1=0;i1<arr.length-1;i1++) {
			for(int j1=i1+1;j1<arr.length;j1++) {
				if(arr[i1]>arr[j1]) {
					int temp=arr[i1];
					arr[i1]=arr[j1];
					arr[j1]=temp;
				}
			}
			if(i1==k-1) {
				System.out.println(arr[i1]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		kthelement(arr,0,n-1,k);
		sc.close();
	}

	
}
