package Day7;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		//3 3 3 2 2 2 1 1 1
		//3 3 2 2 1 1
		//3 2 1
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>=1;j--)
			{
				for(int k=n;k>=i;k--)
				{
				System.out.print(j+" ");
				}
			}

			
			System.out.print("$");
		}
		
	}

}
