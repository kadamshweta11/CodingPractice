package Day26;

import java.util.Scanner;

public class CharacterRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ') continue;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println("First REpeated character is:"+s.charAt(i));
					flag=1;
					break;
				}
				if(flag==1) break;
			}
		}
		if(flag==0) System.out.println("no repeatation is happened");
	}

}
