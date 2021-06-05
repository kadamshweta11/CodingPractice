package Day55;

import java.util.Scanner;

public class Subsequence {
	private static void susequence(int[] arr, int n, int ci, int[] ssa, int cssi) {
	if(ci>=n) {
		print(ssa,cssi);
		return;
	}
	susequence(arr,n,ci+1,ssa,cssi);
	ssa[cssi]=arr[ci];
	susequence(arr,n,ci+1,ssa,cssi+1);
		
	}
	private static void print(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
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
		int ssa[]=new int[3];
		susequence(arr,n,0,ssa,0);
		sc.close();
	}

}
