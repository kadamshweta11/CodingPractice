package Day5;

import java.util.Scanner;

public class matrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows=");
		int rows=sc.nextInt();
		System.out.println("enter no of cols=");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		int brr[][]=new int[rows][cols];
		System.out.println("enter te elements in array1=");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elemnets in array2=");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				brr[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[rows][cols];
		System.out.println("result of addition of 2 matrix is=");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				c[i][j]=arr[i][j]+brr[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}

}
