package Day15;

import java.util.Scanner;

public class LinearSearch {

	public static int search(int a[],int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int ele=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		LinearSearch l=new LinearSearch();
		int res=search(arr,ele);
		if(res==-1)
		{
			System.out.println("element not found");
		}
		else {
			System.out.println("element found at index="+res);
		}

	}

}
