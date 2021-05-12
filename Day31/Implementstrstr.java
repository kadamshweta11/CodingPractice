package Day31;

import java.util.Scanner;

public class Implementstrstr {
	//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
	public static int strstr(String haystack,String needle) {
		if(needle.length()==0) return 0;
		for(int i=0;i<haystack.length();i++) {
			if(i+needle.length()>haystack.length()) {
				return -1;
			}
			for(int j=0;j<needle.length();j++)
			{
				if(needle.charAt(j)==haystack.charAt(i))
				{
					return i;
					
				}
				else {
					break;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String h=sc.next();
		String n=sc.next();
		System.out.println(strstr(h,n));
		sc.close();
	}
	
	
}
