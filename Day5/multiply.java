package Day5;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row1=4, row2=3;
		int col1=3 , col2=4;
		int a[][]= {{1, 1 ,1},
		{2,2,2},{3,3,3},{4,4,4}};
		int b[][]= {
				{1,1,1,1},{2,2,2,2},{3,3,3,3}};
		int[][] prod=new int[row1][col2];
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				for(int k=0;k<col1;k++)
				{
					prod[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(prod[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
