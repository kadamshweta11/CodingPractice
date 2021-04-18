package Day7;

import java.util.Scanner;

public class Zoo {

	

	public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
        
        // Write your code here
       String input=sc.nextLine();
       int cx=0;
       int cy=0;
       for(int i=0;i<input.length();i++)
       {
    	  
        if(input.charAt(i)=='z' || input.charAt(i)=='Z')
        {
        	cx++;
        }
        else
        {
        	cy++;
        }
        
       }
       
       if(2*cx==cy)
       {
       	System.out.println("Yes");
       }
       else {
       	System.out.println("No");
       }
		
		
		
//		
	}

}

