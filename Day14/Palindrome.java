package Day14;

import java.util.Scanner;

public class Palindrome {
	public boolean ispalindrome(String s)
	{
		int start=0;
		int end=s.length()-1;
		while(start<=end)
		{
			if(!isAplhanumeric(s.charAt(start))) start++;
			else if(!isAplhanumeric(s.charAt(end))) end--;
			else {
				char startno=Character.toLowerCase(s.charAt(start));
				char endno=Character.toLowerCase(s.charAt(end));
				if(startno!=endno)
				{
					return false;
				}
				start++;
				end--;
			}
			
		}
		return true;
		
	}
	private boolean isAplhanumeric(char ch) {
		// TODO Auto-generated method stub
		return Character.isDigit(ch)|| Character.isAlphabetic(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		Palindrome p=new Palindrome();
		System.out.println(p.ispalindrome(name));

	}

}
