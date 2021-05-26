package Day45;

import java.util.Scanner;

public class minOp {
	//Given two strings A and B, the task is to convert A to B if possible.
	//The only operation allowed is to put any character from A and insert it at front.
private int operation(String a,String b) {
	if(a.length()!=b.length()) return -1;
	
	int i,j,res=0;
	int count[]=new int[256];
	for( i=0;i<a.length();i++) {
		count[a.charAt(i)]++;
		count[b.charAt(i)]--;
	}
	for(i=0;i<256;i++) 
		if(count[i]!=0) {
			return -1;
		}
	i=a.length()-1;
	j=b.length()-1;
	while(i>=0) {
		if(a.charAt(i)!=b.charAt(j)) {
			res++;
		}
		else {
			j--;
			
		}
		i--;
	}
	
	return res;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings=");
		String a=sc.next();
		String b=sc.next();
		minOp m=new minOp();
		System.out.println(m.operation(a,b));
		sc.close();
	}

}
