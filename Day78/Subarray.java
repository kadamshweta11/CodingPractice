package Day78;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
public class Subarray {
	 static boolean findsum(int arr[],int n)
	    {
	        //Your code here
	      Set<Integer> hs = new HashSet<Integer>();
	        int sum = 0;      
	        for (int i = 0; i < arr.length; i++)
	        {
	            sum += arr[i];
	 
	           
	            if (arr[i] == 0
	                || sum == 0
	                || hs.contains(sum))
	                return true;
	                
	                hs.add(sum);
	        }
	        return false;
	 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if (findsum(arr,n))
            System.out.println(
                "Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
		sc.close();
	}

}
