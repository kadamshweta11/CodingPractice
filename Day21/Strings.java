package Day21;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anton and Artur are old friends. Today they practice in writing strings. 
		//Anton must write each string with
		//the lengths exactly N , based on the alphabet of size M .
		 Scanner sc = new Scanner(System.in);
	        // Write your code here
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        if(n==m)
	        {
	            System.out.println("YES");
	        }
	        else if(n==2 && m==4 || n==4 && m==2)
	        {
	             System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	        }
	}

}
