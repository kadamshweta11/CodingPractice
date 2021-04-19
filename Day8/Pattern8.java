package Day8;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=n-i+1;j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
		
		
		for(int j=0;j<2*i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<n-i+1;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

	}

}
