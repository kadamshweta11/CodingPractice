package Day62;

import java.util.Scanner;
//Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight 
//line at positions x1,...,xN (0 <= xi <= 1,000,000,000).
//
//His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the
//cows from hurting each other, FJ wants to assign the cows to the stalls,
//such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
public class Cows {
	static int c;
	private static int binarysearch(int[] stall,int n) {
		int start=0;
		int end=stall[n-1];
		int max=-1;
		while(start<end) {
			int mid=(start+end)/2;
			if(check(mid,stall,n)==1) {
				if(mid>max) {
					max=mid;	
				}
				start=mid+1;
				
			}
			else {
				end=mid;
			}
		}
		return max;
	}
	public static int check(int num, int[] stall,int n) {
		int cows=1;
		int pos=stall[0];
		for(int i=1;i<n;i++) {
			if(stall[i]-pos>=num) {
				pos=stall[i];
				cows++;
				if(cows==c) {
					return 1;
				}
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			 c=sc.nextInt();
			int stall[]=new int[n];
			for(int i=0;i<n;i++) {
				stall[i]=sc.nextInt();
			}
			
			System.out.println(binarysearch(stall,n));
		}
sc.close();
	}

	

}
