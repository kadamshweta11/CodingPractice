package Day12;

import java.util.Scanner;

public class SumofUnique {

	public static void main(String[] args) {
		//find the sum of distinct elements in an array and if the element id repeated in the array calculate the number for one time only.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==i)
				{
					sum=sum+arr[i];
				}
				if(arr[i]==arr[j]) {
					
					break;
				}
			}
		}
		System.out.println("sum of distinct elements="+sum);
		
	
	}
	

}
