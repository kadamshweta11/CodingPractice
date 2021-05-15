package Day34;


import java.util.Scanner;



import Day26.SecondOccurance;
//Given a string s, check if it can be constructed by taking a 
//substring of it and appending multiple copies of the substring together.
public class Occurance {
	public boolean getCount(String s)
	{
		int len=s.length();
		for(int i=len/2;i>=1;i--) {
			if(len%i==0) {
				int repeat=len/i;
				String substring=s.substring(0,i);
				StringBuilder sb=new StringBuilder();
				for(int j=0;j<repeat;j++) {
					sb.append(substring);
				}
				if(sb.toString().equals(s)) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="aba";
		SecondOccurance O=new SecondOccurance();
		O.getCount(s);
		sc.close();
	}
	

}
