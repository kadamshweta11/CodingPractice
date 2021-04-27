package Day16;

import java.util.Scanner;

public class MinimumSteps {
	//Given an array of integers where each element represents the max number of steps that can be made forward from that element
public int minJumps(int[] arr)
{
	int jumps=1;
	int steps=arr[0];
	int maxreach=arr[0];
if(arr.length<=1) return 0;
	if(arr[0]==0)return -1;
	for(int i=1;i<arr.length;i++)
	{
		if(i==arr.length-1)return jumps;
		maxreach=Math.max(maxreach,i+arr[i]);
		steps--;
		if(steps==0)
		{
			jumps++;
			if(i>=maxreach)return -1;
			steps=maxreach-i;
		}
	}
	return jumps;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		MinimumSteps m=new MinimumSteps();
		System.out.println(m.minJumps(arr));
	}

}
