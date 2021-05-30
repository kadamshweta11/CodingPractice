package Day49;

import java.util.Scanner;
//A company transmitting data to another server.the data is in form of numbers.
//To secure the data during transmission the get a security key that will be sent along with the data.
//the security key is defined as the count of repeating digits in data.
//write the algorithm to find the security key for the data.
public class Security {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to generate security key");
		long n=sc.nextLong();
		int arr[]=new int[10];
		while(n!=0) {
			arr[(int) (n%10)]++;
			n=n/10;
		}
		int count=0;
		for(int i=0;i<10;i++) {
			if(arr[i]>1) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("security key is="+count);
		}
		else {
			System.out.println("no security key=-1");
		}
		sc.close();
	}
}
