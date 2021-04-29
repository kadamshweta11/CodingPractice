package Day18;

import java.util.Scanner;

public class Duplicate {
	static final int noofchar=256;
	static void fillcount(String s,int count[])
	{
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
	}
static void printdupli(String s)
{
	int count[]=new int[noofchar];
	fillcount(s,count);
for(int i=0;i<noofchar;i++)
{
	if(count[i]>1)
	{
		System.out.println((char) i + "count="+count[i]);
	}
}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		printdupli(s);
	}

}
