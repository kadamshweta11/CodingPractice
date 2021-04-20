package Day9;

import java.util.Scanner;
//Input:
//N = 2
//Output:
//5
public class School {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int N=sc.nextInt();
			School s=new School();
			int res=s.oppositeFaceOfDice(N);
		}
		

	}
    static int oppositeFaceOfDice(int N){
        // code here
        // if(N==1)
        // {
        //     return 6;
        // }
        // else if(N==2)
        // {
        //     return 5;
        // }
        // else if(N==3)
        // {
        //     return 4;
        // }
        // else if(N==4)
        // {
        //     return 3;
        // }
        // else if(N==5)
        // {
        //     return 2;
        // }
        // else{
        //     return 1;
        // }
        return 7-N;
      
    }
}


