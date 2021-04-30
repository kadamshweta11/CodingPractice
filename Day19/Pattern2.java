package Day19;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		A                 A 
//		B B             B B 
//		C C C         C C C 
//		D D D D     D D D D 
//		E E E E E E E E E E 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch +" ");
				
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch +" ");
			}
			System.out.println();
			ch++;
		}
		
	}

}
