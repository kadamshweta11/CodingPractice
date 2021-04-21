package Day10;

import java.util.Scanner;

public class BeautifulNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//While playing a mental math game, you realize that the number k is mathematically beautiful.
		 Scanner sc = new Scanner(System.in);
	        // Write your code here
	        int t=sc.nextInt();
	        while(t-->0)
	        {
	        int x=sc.nextInt();
	        int k=sc.nextInt();
	        while(x!=0)
	        {
	        if(x%k!=0)
	        {
	        x--;
	        if(x%k!=0)
	        {
	        System.out.println("NO");
	        break;
	        }
	        else
	        x=x/k;
	        }
	        else
	        x=x/k;
	        if(x==0)
		 	       System.out.println("YES");
	        }
	        }
	        
	        
	}

}
