package Day22;

import java.util.Scanner;

public class DigitsWithChar {
static String getString(String s)
{
	 char arr[]=s.toCharArray();
     for(int i=1;i<arr.length;i=i+2)
     {
         arr[i]=(char)(arr[i-1]+arr[i]-'0');
     }
     return String.valueOf(arr);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		System.out.println(getString(s));
	}

}
