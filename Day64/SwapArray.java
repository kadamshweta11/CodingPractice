package Day64;

import java.util.Scanner;

public class SwapArray {
//write a java program to swap two arrays of same length without repeating the numbers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i]!=arr2[j]) {
					int temp=arr[i];
					arr[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("a="+arr[i] +"  "+"b="+arr2[i]);
		}
	}

}
