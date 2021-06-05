package Day55;

import java.util.Scanner;

public class Subarray {
	public static void  array(int[] arr, int n) {
		for(int one=0;one<n;one++) {
			for(int two=one;two<n;two++) {
				print(arr,one,two);
			}
		}
		
	}

	public static void print(int[] arr, int one, int two) {
		for(int i=one;i<=two;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		Subarray a=new Subarray();
		array(arr,n);
		sc.close();
	}

	
}
