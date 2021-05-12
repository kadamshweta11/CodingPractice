package Day31;

import java.util.Scanner;

public class Binary {
	//You are given two binary strings A and B of equal length.
	//You have a type of opertion in which you can swap any two elements of string B.
	public static int isEqual(String a,String b) {
		 int al=a.length();
		 int bl=b.length();
		 int count=0;
		char s1='.',s2='.',t1='.',t2='.';
		 if(al==bl) {
			 for(int i=0;i<al;i++) {
				 if(a.charAt(i)!=b.charAt(i))
				 {
					 count++;
					 if(count==1) {
						 s1=a.charAt(i);
						 s2=b.charAt(i);
					 }
					 
					 else if(count==2)
					 {
						 t1=a.charAt(i);
						 t2=b.charAt(i);
					 }
					 else {
						 return 0;
					 }
				 }
			 }
			
		 }
		 if(count==0) return 1;
		if(s1==t2 &&s2==t1) return 1;
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		Binary bc=new Binary();
		System.out.println(bc.isEqual(a,b));
	}

}
