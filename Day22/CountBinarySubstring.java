package Day22;

import java.util.Scanner;

public class CountBinarySubstring {
	//Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

//Substrings that occur multiple times are counted the number of times they occur.
static int BinarySubstring(String s)
{
	 int arr [] = new int [2];
     int res=0;
     if (s.charAt (0) == '0') 
         arr [0]++;
     else arr [1]++; 
     for (int i = 1; i < s.length (); i++) { 
         char ch = s.charAt (i); 
         if (ch != s.charAt (i-1)) 
             arr [ch - '0'] = 1; 
         else arr [ch - '0']++; 
         if (arr [1 - (ch - '0')] > 0) {
             arr [1 - (ch - '0')]--;
             res++;
         } 
     }
     return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		System.out.println(BinarySubstring(n));
		sc.close();
	}

}
