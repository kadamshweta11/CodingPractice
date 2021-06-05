package Day55;

import java.util.Scanner;

public class NonDupli {
	private int singleNonDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i=i+2) {
			if(i+1<arr.length && arr[i]!=arr[i+1]) {
				return arr[i];
			}
			
		}
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		NonDupli p=new NonDupli();
		System.out.println(p.singleNonDuplicate(arr));
		sc.close();
	}

	

}
