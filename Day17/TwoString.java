package Day17;

import java.util.Arrays;
import java.util.Scanner;

public class TwoString {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		//Given two strings of equal length, you have to tell whether they both strings are identical.
		 Scanner sc = new Scanner(System.in);
	        // Write your code here
	        int T=sc.nextInt();
	       
	       for(int i=0;i<T;i++)
	       {
	           String s1=sc.next();
	           String s2=sc.next();
	           char a[]= s1.toCharArray();
	            char b[]= s2.toCharArray();
	            Arrays.sort(a);
	            Arrays.sort(b);
	            boolean t= Arrays.equals(a,b);
	            if(t){
	            System.out.println("YES");
	             }
	            else{
	                System.out.println("NO");
	               }
	        }
	       sc.close();
	}

}
