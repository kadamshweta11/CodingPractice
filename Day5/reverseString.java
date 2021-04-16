package Day5;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to reverse=");
	String input=sc.nextLine();
	String a[]=input.split(" ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
}
}
