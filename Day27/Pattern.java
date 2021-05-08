package Day27;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
			
		}

	}

}
