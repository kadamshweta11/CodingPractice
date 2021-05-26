package Day45;
//Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
//
//Return the maximum product you can get.
import java.util.Scanner;

public class IntegerBreak {
	  public int integerBreak(int n) {
	         if (n == 2) return 1;
	        if (n == 3) return 2;
	        
	        int output = 1;
	        
	        while (n > 0) {
	            if (n - 3 == 0 || n - 3 >= 2) {
	                output *= 3;
	                n -= 3;
	            } else {
	                output *= 2;
	                n -= 2;
	            }
	        }
	        return output;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		IntegerBreak b=new IntegerBreak();
		System.out.println(b.integerBreak(n));
		sc.close();
	}

}
