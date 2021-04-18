
//       * 
//      *  * 
//     *  *  * 
//    *  *  *  * 

package Day6;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(" * ");
			}
			
			
			System.out.println();
			
		}
	}

}
