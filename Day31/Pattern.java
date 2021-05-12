package Day31;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			6
//	        * 
//	      *   * 
//	    *       * 
//	  *           * 
//	*               * 
//*                   *
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<(i*2);j++)
			{
				if(j>1 &&j<(i*2)-1)
				{
					System.out.print("  ");
				}
				else {
				System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
