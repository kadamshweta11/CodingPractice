package Day30;

import java.util.Scanner;

public class Prefix {
//Given a string s find the length of the longest prefix which is also suffix.the prefix and suffix should not overlap.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int length=s.length();
		int half=length/2;
		if(length<2) {
			System.out.println("-1");
			System.exit(0);
		}
		for(int i=half;i>=0;i--)
		{
			String prefix=s.substring(0,i);
			String suffix=s.substring(length-i,length);
			if(suffix.equals("")||prefix.equals("")) {
				System.out.println("-1");
				System.exit(0);
			}
			if(suffix.equals(prefix))
			{
				System.out.println(suffix.length());
				break;
			}
		}
sc.close();
	}

}
