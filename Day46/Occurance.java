package Day46;

import java.util.Scanner;
//find first and last position of an array in sorted array
public class Occurance {
private static void occur(int[] a,int target) {
	int firstIndex=-1;
	int lastIndex=-1;
	for(int i=0;i<a.length;i++) {
		if(a[i]==target &&firstIndex==-1) {
			firstIndex=i;
		}
		if(a[i]==target && firstIndex!=-1) {
			lastIndex=i;
		}
		
	}
	System.out.println(" firstInde= "+firstIndex+" lastIndex= "+lastIndex);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		occur(a,target);
		sc.close();
	}

}
