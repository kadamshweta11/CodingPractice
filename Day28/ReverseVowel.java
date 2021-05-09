package Day28;

import java.util.Scanner;

public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			if(!isvowel(ch[i]))
			{
				i++;
				continue;
			}
			if(!isvowel(ch[j]))
			{
				j--;
				continue;
			}
			char temp;
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println("output id:");
		System.out.println(String.copyValueOf(ch));
	}

	private static boolean isvowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
		
	}

	

}
