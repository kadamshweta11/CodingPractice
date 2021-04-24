package Day13;

import java.util.Scanner;

public class luckyNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int rowMin=0,column=0;
		int colMax=0;
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			rowMin=arr[i][0];
			column=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]<rowMin)
				{
					rowMin=arr[i][j];
					column=j;
				}
			}
			colMax=arr[0][column];
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j][column]>colMax)
				{
					colMax=arr[j][column];
				}
			}
			if(rowMin==colMax)
			{
				System.out.println("lucky number is="+rowMin);
			}
		}
		
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
