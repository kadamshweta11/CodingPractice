package Day30;

import java.util.Scanner;

public class NoOfVowels {
	//Find the count of vowels in the given string
	private static boolean Vowels(char ch) {
	
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				return true;
			}
			else {
				return false;
			}
		
	}
	public static int count(String s) {
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(Vowels(s.charAt(i))) {
				c++;
			}
			
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(count(s));

	}

	

}
