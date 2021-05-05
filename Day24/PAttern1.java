package Day24;

import java.util.Scanner;

public class PAttern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		*                 * 
//		* *             * * 
//		* * *         * * * 
//		* * * *     * * * * 
//		* * * * * * * * * * 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=4*(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
