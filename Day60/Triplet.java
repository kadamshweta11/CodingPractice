package Day60;

import java.util.Arrays;
import java.util.Scanner;
//Given an array arr[] of distinct integers of size N and a sum value X, 
//the task is to find count of triplets with the sum smaller than the given sum value X.
public class Triplet {
	 long countTriplets(long arr[], int n,int sum)
	    {
	       int res=0;
	        Arrays.sort(arr);
	        for(int i=0;i<n-2;i++){
	            int j=i+1;
	            int k=n-1;
	            while(j<k){
	               if(arr[i]+arr[j]+arr[k]<sum){
	                 res+=(k-j);
	                   j++;
	                 }
	             else{
	                   k--;
	              }
	            }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		Triplet t=new Triplet();
		System.out.println(t.countTriplets(arr, n, x));
		sc.close();
	}

}
