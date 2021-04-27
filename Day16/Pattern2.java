package Day16;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		//draw the given pattern
//		5
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
