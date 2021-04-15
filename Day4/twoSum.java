package Day4;

import java.util.Scanner;

public class twoSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the num array=");
		for(int i=0;i<n;i++)
		{
		 arr[i]=sc.nextInt();
		}
		System.out.println("enter the target=");
		int target=sc.nextInt();
		int index[]=twoSum(arr,target);
		if(index.length==2)
		{
			System.out.println(index[0]+""+index[1]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int sum=nums[i]+nums[j];
				if(sum==target)
				{
					return new int[] { i, j };
				}
				
			}
		}
		return new int[] {};
        
    }

	

}
