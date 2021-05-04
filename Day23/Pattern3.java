package Day23;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		A A A A A 
//		B B B B 
//		C C C 
//		D D 
//		E 
//		F F 
//		G G G 
//		H H H H 
//		I I I I I 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
			
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}
