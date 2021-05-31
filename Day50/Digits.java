package Day50;

import java.util.Scanner;

public class Digits {
//count the number of digits in given user input number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("no of digits in number is="+count);
sc.close();
	}

}
