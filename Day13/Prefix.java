package Day13;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		//Two strings  and  comprising of lower case English letters are 
		//compatible if they are equal or can be made equal by following this step any number of times:
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		boolean isyes=true;
		assert a.length()>=1 && a.length()<=1e6;  //Assertion ensure the correctness of any assumption which is done in program
//		assertion is by default true
//		if(assertion is false)
//		{
//			throw assertion error
//		}
		assert b.length()>=1 && b.length()<=1e6;
		if(a.length()!=b.length())
		{
			isyes=false;
		}
		else {
			int value=30;
			for(int i=0;i<a.length();i++)
			{
				assert a.charAt(i)>='a' && a.charAt(i)<='z';
				assert b.charAt(i)>='a' && b.charAt(i)<='z';
				int temp=b.charAt(i)-a.charAt(i);
				if(temp>value ||temp<0)
				{
					isyes=false;
					break;
				}
				value=temp;
				
			}
		}
		if(isyes)
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
