package Day35;

import java.util.Scanner;
//5
//A A A A A 
//        B B B B 
//C C C 
//    D D 
//E 
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				if(i%2!=0) {
				System.out.print(ch+" ");
				}
			}
			if(i%2==0) {
				for(int k=i;k<=n;k++) {
					System.out.print("  ");
				}
				for(int k=n;k>=i;k--) {
					System.out.print(ch+" ");
				}
				
			}
			System.out.println();
			ch++;
		}
	}

}
