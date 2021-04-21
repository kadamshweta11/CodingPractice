package Day10;

import java.util.Scanner;

public class levels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You need to output top 3 names of the coders who spent most time in coding.
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String name[]=new String[10005];
		for(int i=0;i<t;i++)
		{
			String user=sc.next();
			int time=sc.nextInt();
			name[time]=user;
		}
		int top=0;
		int index=1000;
		while(top!=3)
		{
			if(name[index]!=null)
			{
				System.out.println(name[index]);
				top++;
			}
			index--;
		}
		
		
		sc.close();
	}

}
