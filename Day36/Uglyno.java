package Day36;

import java.util.Scanner;

public class Uglyno {
//	An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//
//	Given an integer n, return true if n is an ugly number.
	 public boolean isUgly(int n) {
	        int temp;
	        temp=n;
	        while(temp<=0){ return false;}
	           
	    
	        while(n%2==0 ) n/=2;
	        while(n%3==0) n/=3;
	        while(n%5==0) n/=5;
	          
	        return n==1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Uglyno u=new Uglyno();
		System.out.println(u.isUgly(n));
	}

}
