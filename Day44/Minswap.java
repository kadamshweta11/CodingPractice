package Day44;

import java.util.Scanner;
import java.util.Vector;
//You are given a string S of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets.
//A string is considered balanced if it can be represented in the for S2[S1] where S1 and S2 are balanced strings. 
public class Minswap {
	 static int minimumNumberOfSwaps(String s){
	        // code here
	        Vector<Integer>pos=new Vector<>();
	        for(int i = 0; i < s.length(); ++i)
	        if (s.charAt(i) == '[')
	            pos.add(i);
	            int count=0,p=0;
	           int sum=0;
	             char[] S = s.toCharArray();
	             for(int i=0;i<s.length();i++){
	                 if (S[i] == '[')
	        {
	            ++count;
	            ++p;
	        }
	        else if (S[i] == ']')
	            --count;
	            if(count<0){
	                sum += pos.get(p) - i;
	            char temp = S[i];
	            S[i] = S[pos.get(p)];
	            S[pos.get(p)] = temp;
	            ++p;
	  
	            // Reset count to 1
	            count = 1;
	            }
	             }
	             return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			System.out.println(minimumNumberOfSwaps(s));
		}

	}

}
