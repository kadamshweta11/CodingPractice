package Day55;

import java.util.Scanner;

public class Divide {
	private int divide(int dividend, int divisor) {
		// TODO Auto-generated method stub
		if(divisor==-1 && dividend==Integer.MIN_VALUE) {
			return Integer.MAX_VALUE;
		}
		return (int)dividend/divisor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Divide d=new Divide();
		
		System.out.println(d.divide(n,m));
	}

	

}
