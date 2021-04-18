package Day7;

import java.util.Scanner;

public class People {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Write your code here
        String s=sc.nextLine();
        int res1=s.charAt(0)+s.charAt(1);
        int res2=s.charAt(3)+s.charAt(4);
        int res3=s.charAt(4)+s.charAt(5);
        int res4=s.charAt(7)+s.charAt(8);
        if(res1%2==0 && res2%2==0 && res3%2==0 && res4%2==0)
        {
        	if(s.charAt(2)!='A'|| s.charAt(2)!='E'||s.charAt(2)!='I'||s.charAt(2)!='O'||s.charAt(2)!='U'||s.charAt(2)!='Y')
            {
        	System.out.println("valid");
        }
        }
        else
        {
        	System.out.println("invalid");
        }
	}

}
