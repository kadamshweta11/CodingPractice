package Day11;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//print the largest element from the matrix
		System.out.println("enter number of rows=");
		int rows=sc.nextInt();
		System.out.println("enter number of column=");
		int column=sc.nextInt();
		int arr1[][]=new int[rows][column];
		int max=arr1[0][0];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(arr1[i][j]>max)
				{
					max=arr1[i][j];
				}
				
			}
		}
		

		System.out.println("the largest element in matrix is"+ max);
sc.close();
	}

}
