package Day43;

import java.util.Scanner;
//Given an integer n, return true if it is a power of four. Otherwise, return false.
public class Powerof4 {
	 public boolean isPowerOfFour(int num) {
	        return (num>0) &&((num & (num-1))==0) && (num%3==1);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
      int n=sc.nextInt();
        
        Powerof4 p=new Powerof4();
        System.out.println(p.isPowerOfFour(n));
        }
        sc.close();
	}

}
