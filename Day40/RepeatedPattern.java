package Day40;

import java.util.Scanner;

public class RepeatedPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   * *   * *   
//		 *     *     * 
//		 *           * 
//		   *       *   
//		     *   *     
//		       *       
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			for(int j=0;j<6+1;j++) {
				if(i==0 && j%3!=0 ||i==1 && j%3==0 ||i-j==2 || i+j==8) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
