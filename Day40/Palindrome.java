package Day40;

import java.util.Scanner;
//Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. 
//Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
public class Palindrome {
	
	public static int palinArray(int[] a, int n)
    {
        for(int i=0;i<n;i++){
            int rev=0;
        int temp=a[i];
        while(temp>0){
            int last=temp%10;
             temp=temp/10;
            rev=(rev*10)+last;
           
        }
        if(rev!=a[i]) return 0;
        
    }
    return 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(palinArray(a,n));
		}
		sc.close();
	}

}
