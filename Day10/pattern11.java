package Day10;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		4
//	      * 
//	    * * 
//	  * * * 
//	* * * * 
//	  * * * 
//	    * * 
//	      * 
		int n=sc.nextInt();
		int rows=2*n-1;
		for(int i=1;i<=rows;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<=n-1;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int j=1;j<=(i-n);j++)
				{
					System.out.print("  ");
				}
				for(int j=i;j<2*n;j++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
