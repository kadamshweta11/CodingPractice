package Day46;

import java.util.Scanner;
//Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value.
public class IndexValue {
private static int Values(int a[]) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==i) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Values(a));
		sc.close();
	}

}
