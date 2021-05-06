package Day25;

import java.util.Scanner;

public class Duplicate {
//	Remove all the duplicate characters from the given string
	public static String removeDuplicateCharacter(String S){
		String newStr="";
		for(int i=0;i<S.length();i++)
		{
			char ch=S.charAt(i);
			if(newStr.indexOf(ch)==-1)
			{
				newStr+=ch;
			}
		}
		return newStr;
      
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		System.out.println(removeDuplicateCharacter(S));
		sc.close();
	}

}
