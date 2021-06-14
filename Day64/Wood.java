package Day64;

import java.util.Scanner;

public class Wood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long m=sc.nextInt();
		int arr[]=new int[(int) n];
		long max=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		long h=0;
		long beg,end,mid;
		long cutted;
		beg=0;
		end=max;
		while(beg<=end) {
			mid=(beg+end)/2;
			cutted=0;
			for(int i=0;i<n;i++) {
				if(arr[i]-mid>0) {
					cutted+=arr[i]-mid;
				}
			}
			if(cutted>m) {
				beg=mid+1;
				if(mid>h) {
					h=mid;
				}
			}
			else if(cutted<m) {
				end=mid-1;
			}
			else {
				h=mid;
				break;
			}
		}
		System.out.println(h);
		
	sc.close();	
		
	}

}
