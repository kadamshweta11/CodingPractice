package Day11;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//N = 4
//		Output:
//			*******
//			 *****
//			  ***
//			   *
		int n=sc.nextInt();
		for( int i=n;i>0;i--)
		{
			
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
