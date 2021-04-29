package Day18;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n/2;j++)
			{
				if((j==0 || j==n/2)&& i!=0 ||i==0 &&j!=n/2 ||i==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
