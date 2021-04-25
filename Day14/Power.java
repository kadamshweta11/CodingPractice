package Day14;

import java.util.Scanner;

public class Power {
	public boolean Poweroftwo(int n)
	{
		if(n<=0) return false;
		if(n==1) return true;
		if(n%2!=0 && n!=1) return false;
		n=n/2;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Power p=new Power();
		System.out.println(p.Poweroftwo(n));
	}

}
