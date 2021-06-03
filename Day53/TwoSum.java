package Day53;

import java.util.Scanner;

public class TwoSum {
private void second(int[] arr,int n,int sum) {
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" "+arr[j]);
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
		TwoSum t=new TwoSum();
		t.second(arr,n,20);
	}

}
