package Day6;

import java.util.Scanner;

public class BIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		    hammingWeight(n);
		
	}
	public static int hammingWeight(int n) {
        int count=0;
        int no=1;
        for(int i=0;i<32;i++)
        {
           if((n & no)!=0)
            {
                count++;
            }
            no<<=1;
        }
        return count;
    }

}
