package Day11;

import java.util.Scanner;

public class NegativeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//print the count of negative element from the matrix
		System.out.println("enter number of rows=");
		int rows=sc.nextInt();
		System.out.println("enter number of column=");
		int column=sc.nextInt();
		int count=0;
		int arr1[][]=new int[rows][column];
		int max=arr1[0][0];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j]<0)
				{
					count++;
				}
				
			}
		}
		System.out.println("number of negative elements in matrix is="+count);
	}

}
