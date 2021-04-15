package Day4;

import java.util.Scanner;

public class reverseInt {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int rever=reverse(x);
	System.out.println(rever);
	}
	    public static int reverse(int x) {
	        int rev=0;
	        int temp=x,lastno;
	        while(temp!=0)
	        {
	            lastno=temp%10;
	            temp/=10;
	            rev=rev*10+lastno;
	        }
	        return rev;
	    }
	  
	}


