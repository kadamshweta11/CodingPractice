package Day30;

import java.util.ArrayList;
import java.util.Scanner;
//A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase.
public class NiceString {
	public boolean NiceOfString(String s) {
		if(s.length()==1) return false;
		
		for(int i=0;i<s.length();i++)
		{char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				if(!s.contains(Character.toLowerCase(ch)+"")) {
					return false;
				}
			}
				else {
					if(!s.contains(Character.toUpperCase(ch)+""))
						return false;
					
				}
			
		}
		return true;
	
	}
	public String NiceOne(String s) {
		ArrayList<String> li=new ArrayList<>();
		if(s.length()==1) return "";
		int count=0;
		int length=s.length();
		for(int i = 0;i<length;i++){
			for(int j=i+1;j<=length;j++)
			{
				String subst=s.substring(i,j);
				if(NiceOfString(subst))
				{
					int sublength=subst.length();
					if(sublength>count)
					{
						count=sublength;
						li.clear();
						li.add(subst);
					}
				}
			}
		}
		if(li.size()==0) {
			return "";
		}
		else {
			return li.get(0);
		}
	}
	public static void main(String[] args) {
		//aAbB=nice    AbA=not nice
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		NiceString n=new NiceString();
		System.out.println(n.NiceOne(s));

	}

	

}
