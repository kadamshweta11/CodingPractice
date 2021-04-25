package Day14;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		//Print the given pattern
//		4
//	      1   
//	    1   2   
//	  1   2   3   
//	1   2   3   4  
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"   ");
			}
			System.out.println();
		}
	}

}
