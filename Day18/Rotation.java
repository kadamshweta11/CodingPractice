package Day18;

import java.util.Scanner;

public class Rotation {
 static boolean isrotation(String s1,String s2)
 {
	String temp=s1+s1;
	return (s1.length()==s2.length()&& temp.indexOf(s2)!=-1);
	
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(isrotation(s1,s2))
		{
			System.out.println("s1 and s2 are rotaion of eachother");
		}
		else {
			System.out.println("s1 and s2 are not rotaion of eachother");
		}
	}

}
