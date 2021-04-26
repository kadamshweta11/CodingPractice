package Day15;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}		
		
		int mid=0;
		int low=0;
		int high=n-1;
		int temp=0;
		while(mid<=high)
		{
			switch(a[mid])
			{
			case 0:
				temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
