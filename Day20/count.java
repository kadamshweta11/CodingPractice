package Day20;

import java.util.Scanner;

public class count {
	 public String countAndSay(int n) {
	        String val="1";
	        for(int i=0;i<n-1;i++)
	        {
	            char c=val.charAt(0);
	            StringBuilder s=new StringBuilder();
	            int count=1;
	            for(int j=1;j<val.length();j++)
	            {
	                if(c!=val.charAt(j))
	                {
	                    s.append(count);
	                    s.append(c);
	                    count=0;
	                    c=val.charAt(j);
	                }
	                count++;
	            }
	            s.append(count);
	            s.append(c);
	            val=s.toString();
	        }
	        return val;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		count co=new count();
		System.out.println(co.countAndSay(n));
	}

}
