package Day59;

import java.util.Scanner;

public class Arthematic {
	 static int inSequence(int A, int B, int C){
	        // code here
	        if(C==0){
	            if(A==B){
	                return 1;
	            }
	            else{
	                return 0;
	            }
	        }else{
	            if((B-A)/C<0){
	                return 0;
	                
	            }
	            else{
	                if((B-A)%C==0){
	                    return 1;
	                }
	                else{
	                    return 0;
	                }
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		inSequence(A,B,C);
		sc.close();
	}

}
