package Day13;

import java.util.Scanner;

public class Number {

	public int[] smallerNumbersThanCurrent(int[] nums) {
	       int a[]=new int[nums.length];
	        for(int i=0;i<nums.length;i++)
	        {
	             int count=0;
	            for(int j=0;j<nums.length;j++)
	            {
	                if(nums[j]<nums[i] && j!=i)
	                {
	                    count++;
	                }
	            }
	            a[i]=count;
	        }
	        return a;
	                 
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Number no=new Number();
		int a[]=no.smallerNumbersThanCurrent(arr);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
