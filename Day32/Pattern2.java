package Day32;

import java.util.Scanner;

public class Pattern2 {
//	5
//	E E E E E 
//	E D D D D 
//	E D C C C 
//	E D C B B 
//	E D C B A 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=0;
		int ch=65;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--) {
				System.out.print((char)(ch+j-1)+" ");
				t=j;
			}
			for(int k=n-i+1;k<n;k++) {
				System.out.print((char)(ch+t-1)+" ");
			}
			System.out.println();
		}
	}

}
