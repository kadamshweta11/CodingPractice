package Day11;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//simple program to find the element in two dimensional array without binary search algorithm.
		System.out.println("enter number of rows=");
		int rows=sc.nextInt();
		System.out.println("enter number of column=");
		int column=sc.nextInt();
		int arr1[][]=new int[rows][column];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the number to check whether its in matrix or not?=");
		int k=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(arr1[i][j]==k)
				{
					System.out.println("number found"+ arr1[i][j]);
					System.exit(arr1[i][j]);
				}
				else {
					System.out.println("oops number not found");
				}
				
				
			}
		}
		
sc.close();
	}

}
