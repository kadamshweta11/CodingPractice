package Day42;

import java.util.Scanner;
//write a program to get the permutation of all distinct elements of array
public class Permutationarray {
	public static void printArray(int[] a) {
		System.out.println("");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void swap(int[] a,int i,int j) {
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
public static void permutation(int[] a,int cid) {
	if(cid==a.length-1) {
		printArray(a);
		return;
	}
	for(int i=cid;i<a.length;i++) {
		swap(a,i,cid);
		permutation(a,cid+1);
		swap(a,i,cid);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//int[] a=new int[n];
//for(int i=0;i<n;i++) {
//	a[i]=sc.nextInt();
//}
//int p=permutation(a, 0);
//System.out.println(p);
		int a[]= {1,2,3};
		permutation(a,0);
	}

}
