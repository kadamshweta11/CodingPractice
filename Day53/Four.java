package Day53;

import java.util.Scanner;

public class Four {
private void number(int[] arr,int n,int sum) {
	for(int i=0;i<n-3;i++) {
		for(int j=i+1;j<n-2;j++) {
			for(int k=j+1;k<n-1;k++) {
				for(int m=k+1;m<n;m++) {
					if(arr[i]+arr[j]+arr[k]+arr[m]==sum) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[m]);
					}
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
		Four f=new Four();
		f.number(arr,n,11);
		sc.close();
	}

}
