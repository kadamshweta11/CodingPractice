package Day32;

import java.util.Scanner;

public class Pattern {
//	4
//	A B C D E 
//	A B C D 
//	A B C 
//	A B 
//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ch=65;
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}

}
