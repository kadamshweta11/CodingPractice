package Day21;

import java.util.Scanner;

public class NumericString {
static String printsequence(String[] arr, String input) {
		String output="";
		int n=input.length();
		for(int i=0;i<n;i++)
		{
			if(input.charAt(i)==' ') output+=0;
			else {
				 int l = input.charAt(i)-'A';
				output=output+arr[l];
			}
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given a sentence in the form of a string, convert it into its equivalent
		//mobile numeric keypad sequence.
		Scanner sc = new Scanner(System.in);
		String arr[]= {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
		String input=sc.next();
		System.out.println(printsequence(arr,input));

}
}
 
