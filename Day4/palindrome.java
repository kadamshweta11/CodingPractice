package Day4;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check palindrome=");
		int x=sc.nextInt();
		boolean pali=isPalindrome(x);
		System.out.println(pali);

	}
	 public static boolean isPalindrome(int x) {
	        int temp=x;
	       
	        int lastno,rev=0;
	        if(x < 0) {
	           return false;
	        }
	        while(temp!=0){
	            lastno=temp%10;
	            rev=rev*10+lastno;
	            temp/=10;
	        }
	        
	        if(x==rev)
	        {
	            return true;
	        }
	        else{
	            return false;
	        }
	        
	    }

}
