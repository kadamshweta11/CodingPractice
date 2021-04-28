package Day17;

import java.util.Scanner;

public class Uppercase {
static void toend(String s,int length)
{
	//Given the string contains the upprecase letters as well as lower
	//case letters .the task is to move the uppercase letters at the end of the string
	String temp="";
	for(int i=0;i<length;i++)
	{
		if(s.charAt(i)>=65 &&s.charAt(i)<=90)
		{
			temp=temp+s.charAt(i);
		}
		else {
			System.out.print(s.charAt(i));
		}
	}
	System.out.print(temp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String s=sc.next();
		 int length=s.length();
		toend(s,length);
	}

}
