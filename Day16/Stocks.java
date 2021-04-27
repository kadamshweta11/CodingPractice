package Day16;

import java.util.Scanner;

public class Stocks {
public int max(int[] prices) {
	int max=0;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<prices.length;i++)
	{
		if(prices[i]<min)
		{
			min=prices[i];
		}
		if(prices[i]-min>max)
		{
			max=prices[i]-min;
		}
	}
	return max;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Stocks s=new Stocks();
		System.out.println(s.max(arr));
	}

}