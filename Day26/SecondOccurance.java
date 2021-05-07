package Day26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SecondOccurance {
	//Find or Print the number of occura-nce of each string at the output.
	public void  getCount(String s)
	{
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		HashMap <String,Integer>hm=new HashMap<>();
		for(String a:arr)
		{
			if(hm.containsKey(a))
			{
				hm.replace(a,hm.get(a)+1);
			}else {
				hm.put(a,1);
			}
		}
		System.out.println(hm);
		
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s="seek, for, seek, for, seek, aaa";
		SecondOccurance O=new SecondOccurance();
		O.getCount(s);
	}
	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}
