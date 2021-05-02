package Day21;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		8
//	       A 
//	      B B 
//	     C C C 
//	    D D D D 
//	   E E E E E 
//	  F F F F F F 
//	 G G G G G G G 
//	H H H H H H H H 
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}

	}

}
