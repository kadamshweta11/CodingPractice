package Day16;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		//draw the given pattern
//		5
//        *   
//      *   *   
//    *   *   *   
//  *   *   *   *   
//*   *   *   *   *   
//  *   *   *   *   
//    *   *   *   
//      *   *   
//        *   
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*   ");
			}
//			
			System.out.println();
		}
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
				{
					System.out.print("  ");
				}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
sc.close();
	}

}
