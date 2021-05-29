package Day48;

import java.util.Scanner;
//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//
//You must solve the problem without using any built-in library for handling large
//integers (such as BigInteger). You must also not convert the inputs to integers directly.
public class Stringadd {
	public String addStrings(String num1, String num2) {
	       if(num1==null) return num2;
	        if(num2==null) return num1;
	        
	        int digit1 = 0, digit2 = 0;
	        int sum = 0, carry = 0;
	        int len1 = num1.length()-1, len2 = num2.length()-1;
	        StringBuffer sb = new StringBuffer();
	        
	        while(len1>=0 || len2>=0) {
	            digit1 = len1>=0 ? (num1.charAt(len1--)-'0') : 0;
	            digit2 = len2>=0 ? (num2.charAt(len2--)-'0') : 0;
	            sum = carry+digit1+digit2;
	            sb.append(sum%10);
	            carry = sum/10;
	        }
	        if(carry!=0) sb.append(carry);
	        return sb.reverse().toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1=sc.next();
		String num2=sc.next();
		Stringadd a=new Stringadd();
		System.out.println(a.addStrings(num1, num2));
sc.close();
	}

}
