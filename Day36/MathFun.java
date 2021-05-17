package Day36;

import java.util.Scanner;

public class MathFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=50;
		double b=30;
		double res=b-a;
		System.out.println("abs return positive value="+Math.abs(res));
		System.out.println("sqrt return ss root of value="+Math.sqrt(b));
		System.out.println("addexact return addition of 2 nos="+Math.addExact(3, 2));
		System.out.println("log value of no="+Math.log(b));
		System.out.println("subexact gives substraction"+Math.subtractExact(50, 30));
		System.out.println("power of no="+Math.pow(a, 2));
		System.out.println(Math.exp(a));
	}

}
