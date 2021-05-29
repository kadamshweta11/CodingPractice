package Day48;

import java.util.Scanner;

public class Missing {
public static void miss(int n,int[] a) {
	int exp=a.length+1;
	int total=exp*(exp+1)/2;
	//System.out.println(total);
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
	}
	System.out.println("missing no is="+ (total-sum));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		miss(n,a);
		sc.close();
	}

}
