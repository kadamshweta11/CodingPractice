package Day5;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2*(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
//https://leetcode.com/problems/reverse-words-in-a-string/