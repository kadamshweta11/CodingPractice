package Day36;

import java.util.HashSet;
import java.util.Scanner;
//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
public class Happyno {
	
	    public boolean isHappy(int n) {
	      HashSet <Integer> set=new HashSet<>(); 
	       
	        set.add(n);
	        while(n>0){
	             int sum=0;
	            while(n>0){
	                int digit=n%10;
	                sum=sum+(digit*digit);
	                n=n/10;
	            }
	            if(sum==1) return true;
	            else if(set.contains(sum)) return false;
	            set.add(sum);
	            n=sum;
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Happyno no=new Happyno();
		System.out.println(no.isHappy(n));
		sc.close();
	}

}
