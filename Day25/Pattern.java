package Day25;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// Print given Pattern
//		5
//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F 
//		G G G 
//		H H 
//		I 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch+" ");
				}
				System.out.println();
				ch++;
			}
		for(int i=n-1;i>=0;i--) {
		for(int j=0;j<=i-1;j++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		ch++;
		}
	}

}
