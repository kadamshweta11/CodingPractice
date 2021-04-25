package Day14;

import java.util.Scanner;

public class SingleD {
	//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
	public int singleNumber(int[] nums)
	{
		int ans=0;
		for(int num:nums)
		{
			ans=ans^num;
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SingleD d=new SingleD();
		System.out.println("single digit in array is="+d.singleNumber(a));
		
	}

}
