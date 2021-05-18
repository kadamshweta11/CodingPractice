package Day37;

import java.util.Scanner;
//Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
public class calmoney {
	public int totalMoney(int n) {
        int row=n/7;
        int col=n%7;
        return row*(1+7)*7/2+7*(row-1)*row/2+(1+col)*col/2+row*col;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
calmoney s=new calmoney();
System.out.println(s.totalMoney(n));
	}

}
