package Day9;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rows=2*n-1;
		for(int i=1;i<=rows;i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
			}
			else {
				for(int j=2*n-i;j>=1;j--)
				{
					System.out.print("* ");
				}
			}
		System.out.println();
		}
	}

}