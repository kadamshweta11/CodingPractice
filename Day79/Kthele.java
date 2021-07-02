package Day79;

import java.util.Scanner;
//Given two sorted arrays arr1 and arr2 of
//size M and N respectively and an element K. 
//The task is to find the element that would be at the k’th position of the final sorted array.
public class Kthele {
	 public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
	        long[] sorted1 = new long[m + n];
	        int i = 0, j = 0, d = 0;
	        while (i < n && j < m)
	        {
	            if (arr1[i] < arr2[j])
	                sorted1[d++] = arr1[i++];
	            else
	                sorted1[d++] = arr2[j++];
	        }
	        while (i < n)
	            sorted1[d++] = arr1[i++];
	        while (j < m)
	            sorted1[d++] = arr2[j++];
	        return sorted1[k - 1];
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		int arr2[]=new int[m];
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++) {
			arr2[j]=sc.nextInt();
		}
		System.out.println(kthElement(arr,arr2,n,m,k));
		sc.close();
	}

}
