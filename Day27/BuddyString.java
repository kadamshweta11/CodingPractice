package Day27;

import java.util.HashSet;
import java.util.Scanner;
//Given two strings a and b, return true if you can swap two letters in a so the result is equal to b, otherwise, return false.
//
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at a[i] and a[j].
public class BuddyString {

	public boolean twoString(String a,String b)
	{
		if(a.length()!=b.length()) return false;
		int diff=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i)) diff++;
			
		}
		if(diff>2) return false;
		if(diff==0)
		{
			HashSet<Character>h=new HashSet<>();
			for(int i=0;i<a.length();i++)
			{
				if(h.contains(a.charAt(i)))
					return true;
				h.add(a.charAt(i));
			}
			return false;
		}
		int chnge=-1;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i)) chnge=i; break;
			
		}
		for(int i=chnge+1;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i))
			{
				if(a.charAt(chnge)==b.charAt(i) && a.charAt(i)==b.charAt(chnge))
				{
					return true;
				}else {
				return false;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		BuddyString s=new BuddyString();
		System.out.println(s.twoString(a,b));
		sc.close();

	}

}
