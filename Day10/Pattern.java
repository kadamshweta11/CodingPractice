package Day10;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
//		 Input n=4
//				 Output:
//				 ****
//				   *
//				  *
//				 ****
	        // Write your code here
	    int n=sc.nextInt();
//	    
	   
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(i==0|| j==n-1-i ||i==n-1 )
	    		{
	    			System.out.print("*");
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    		
	    	}
	    	
    		System.out.println();
	    }
	}

}
