package Day20;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6
//		 A  A  A  A  A  A  
//		  B  B  B  B  B  
//		   C  C  C  C  
//		    D  D  D  
//		     E  E  
//		      F  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n-i+1;j>=1;j--)
			{
				System.out.print(ch+"  ");
			}
			System.out.println();
			ch++;
		}
	}

}
