package Day42;

import java.util.Scanner;

public class arrangecoins {
	 public int arrangeCoins(int n) {
	        int size=1;
	        int res=0;
	        while(n>0 &&n>=size){
	            n=n-size;
	            size++;
	            res++;
	        }
	        return res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arrangecoins a=new arrangecoins();
		System.out.println(a.arrangeCoins(n));
		sc.close();

	}

}
