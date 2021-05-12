package Day31;

import java.util.Scanner;

public class swapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//with third variable
//		int t=a;
//		    a=b;
//		    b=t;
		    //without third variable
		    a=a+b;
		    b=a-b;
		    a=a-b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
