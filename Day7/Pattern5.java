package Day7;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=01;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
