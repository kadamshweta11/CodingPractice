package Day16;

import java.util.Scanner;

public class Duplicate {
	public int findDuplicate(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
		int repeat=Math.abs(nums[i]);
		if(nums[repeat-1]<0)return repeat;
		nums[repeat-1]=nums[repeat-1]*-1;
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Duplicate d=new Duplicate();
		System.out.println(d.findDuplicate(arr));
	}

}
