package Day33;

import java.util.Scanner;

public class Missing {
//write a program to find out the missing number in array and print it.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int exp=arr.length+1;
		int sum=0;
		int total=exp*(exp+1)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("missing no is="+(total-sum));
		sc.close();
	}

}
