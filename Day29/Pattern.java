package Day29;

import java.util.Scanner;

public class Pattern {
	
public static void main(String[] args) {
//	5
//	*       * 
//	  *   *   
//	    *     
//	  *   *   
//	*       * 
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j||i+j==n-1)
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
