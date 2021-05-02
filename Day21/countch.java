package Day21;

import java.util.Scanner;

public class countch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Print one integer, denoting the number of times her 
		//friends can print "hackerearth" (without quotes).
		Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      String s=sc.next();
	      String ch = "hackerearth";

	       int[] arr = new int[11];

	       int min = Integer.MAX_VALUE;

	       for(int i=0; i<ch.length(); i++) {

	           int count = 0;

	           for(int j=0; j<n; j++) {

	               if(ch.charAt(i)==s.charAt(j)) {

	                   count++;

	               }

	           }

	           arr[i] = count;

	       }

	       arr[0] /= 2;

	       arr[1] /= 2;

	       arr[4] /= 2;

	       arr[5] /= 2;

	       for(int i=0; i<11; i++) {

	           if(arr[i]<min) min = arr[i];

	       }

	       System.out.println(min);

	   }
	}


