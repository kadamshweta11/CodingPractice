package Day5;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double x=sc.nextDouble();
		myPow(x,n);
	}
	
	public static double myPow(double x, int n) {
        return Math.pow(x,n);
    }

}
