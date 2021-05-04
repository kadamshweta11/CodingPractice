package Day23;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		* * * * *     * * * * * 
//		* * * *         * * * * 
//		* * *             * * * 
//		* *                 * * 
//		*                     *
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<4*(i-1+1);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
