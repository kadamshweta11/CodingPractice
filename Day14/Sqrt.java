package Day14;

import java.util.Scanner;

public class Sqrt {
	//Given a non-negative integer x, compute and return the square root of x.
	public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sqrt s=new Sqrt();
		System.out.println("sqrt of number is="+ s.mySqrt(n));
	}

}
