package Day53;

import java.util.Scanner;

public class Triple {
private void Triple(int[] arr,int n, int sum) {
	for(int i=0;i<n-2;i++) {
		for(int j=i+1;j<n-1;j++) {
			for(int k=j+1;k<n;k++) {
				if(arr[i]+arr[j]+arr[k]==sum) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Triple t=new Triple();
		t.Triple(arr,n,11);
		sc.close();
	}

}
