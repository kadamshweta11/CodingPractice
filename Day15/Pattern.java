package Day15;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//        0  
//     -1   0  
//  -2   -1   0  
// -3  -2  -1   0   
//-4  -3  -2  -1  0  

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j-i+"  ");
			}
			
			System.out.println();
		}
	}

}
