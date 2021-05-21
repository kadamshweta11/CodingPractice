package Day40;

import java.util.Scanner;
//Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//An integer n is a power of three, if there exists an integer x such that n == 3x.
public class Powerof3 {
	 public boolean isPowerOfThree(int n) {
	        int p=0;
	        if(n==0 ||n<0) return false;
	        
	        if(n==0 ||n==2) return false;
	        while(n!=0 && p==0){
	            if(n==2)
	                return false;
	            
	            while(p==2 &&n!=0)
	                if(n==2) return false;
	                    p=n%3;
	                    n=n/3;
	                if(n==0) return true;
	                
	            
	          
	        }
	          return false;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to check=");
		int n=sc.nextInt();
		Powerof3 j=new Powerof3();
		System.out.println(j.isPowerOfThree(n));

	}

}
