package Day22;

import java.util.Scanner;

public class GetOddString {
	//Given an integer n, return a string with n characters such that 
	//each character in such string occurs an odd number of times.

//The returned string must contain only lowercase English letters. 
	//If there are multiples valid strings, return any of them. 
static String OddString(int n) {
	String x="";
	if(n%2==0)
	{
		for(int i=0;i<n-1;i++) {
		x=x+'a';
		}
		x=x+'b';
	}
	else {
		for(int i=0;i<n;i++) {
		x=x+'a';
		}
	}
	return x;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(OddString(n));
	}

}
