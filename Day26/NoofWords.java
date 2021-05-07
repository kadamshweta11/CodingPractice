package Day26;

import java.util.Scanner;

public class NoofWords {
//write a appropriate java program to count the number of words in the given string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(CountWord(s));
		System.out.println("direct function using shortcut form:"+s.split("\\s+").length);
	}

	private static int CountWord(String s) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && i<s.length()-1 &&s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return count;
	}

}
