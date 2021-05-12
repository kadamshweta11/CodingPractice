package Day31;

import java.util.Scanner;

public class PerfectNo {

	public static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(n==sum) {
				return true;
			}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=isPerfect(n);
		if(b) {
			System.out.println("it is perfect no");
		}
		else {
			System.out.println("it is not perfect");
		}
	
	}

}
