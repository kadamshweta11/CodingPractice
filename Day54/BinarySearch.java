package Day54;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int item=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int l=0,h=arr.length-1;
		int mid=(l+h)/2;
		while(l<h) {
		if(arr[mid]==item) {
			System.out.println("element is present at"+mid+"position");
			break;
		}
		else if(arr[mid]<item) {
			l=mid+1;
		}
		else {
			h=mid-1;
		}
		 mid=(l+h)/2;
		}
		if(l>h) {
			System.out.println("element not found");
		}
		sc.close();
	}

}
