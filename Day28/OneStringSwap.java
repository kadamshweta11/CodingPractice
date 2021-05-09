package Day28;

import java.util.Scanner;

public class OneStringSwap {
	private boolean swapString(String a1, String a2) {
		if(a1.length()!=a2.length()) return false;
		int count=0;
		char s1='.',s2='.',p1='.',p2='.';
		for(int i=0;i<a1.length();i++)
		{
			if(a1.charAt(i)!=a2.charAt(i)) {
				count++;
			if(count==1)
			{
				s1=a1.charAt(i);
				s2=a2.charAt(i);
			}
			else if(count==2) {
				p1=a1.charAt(i);
				p2=a2.charAt(i);
			}else
				return false;
			}
		}
		if(count==0) return true;
		return (s1==p2) &&(s2==p1);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a1=sc.next();
		String a2=sc.next();
		OneStringSwap o=new OneStringSwap();
		System.out.println(o.swapString(a1,a2));
		sc.close();
	}

}
