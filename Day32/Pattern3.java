package Day32;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		A J K T U ^ 
//		B I L S V ] 
//		C H M R W \ 
//		D G N Q X [ 
//		E F O P Y Z 
//		F E P O Z Y 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ch=65;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j%2==0)
				{
					System.out.print((char)(ch+n*j+i)+" ");
				}
				else {
					System.out.print((char)(ch+n*(j+1)-i-1)+" ");
				}
				
			}
			System.out.println();
		}
	}

}
