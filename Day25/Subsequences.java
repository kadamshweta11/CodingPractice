package Day25;

import java.util.Scanner;

public class Subsequences {

	public static String[] findSubsequence(String str)
	{
		if(str.length()==0)
		{
			String ans[]= {""};
			return ans;
		}
		String smallans[]=findSubsequence(str.substring(1));
		String ans[]=new String[2*smallans.length];
		int k=0;
		for(int i=0;i<smallans.length;i++)
		{
			ans[k]=smallans[i];
			k++;
		}
		for(int i=0;i<smallans.length;i++)
		{
			ans[k]=str.charAt(0)+smallans[i];
			k++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
String str=sc.next();
String ans[]=findSubsequence(str);
for(int i=0;i<ans.length;i++)
{
	System.out.println(ans[i]);
}
	}

}
