package Day65;

import java.util.Scanner;

public class SmallFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findSum(n));
	}

	 static int findSum(int n) {
		// TODO Auto-generated method stub
		if(n==1) return 5;
		int l=0;
		int h=n*5;
		while(l<h) {
			int mid=(l+h)>>1;
		if(check(mid,n)) {
			h=mid;
		}
		else {
			l=mid+1;
		}
		}
		return l;
		
	}

	static boolean check(int p, int n) {
		int temp=p;
		int c=0;
		int f=5;
		while(f<=temp) {
			c+=temp/f;
			f=f*5;
		}
		return (c>=n);
	}

}
