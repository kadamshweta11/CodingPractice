package Day51;

import java.util.Scanner;

public class Majority {
	 static int majorityElement(int a[], int size)
	    {
	        // your code here
	        int m=a[0];
	        int count=1;
	        for(int i=1;i<size;i++){
	            if(a[i]==m) count++;
	            else count--;
	            if(count==0){
	                m=a[i];
	                count=1;
	            }
	        }
	        int c=0;
	        for(int i=0;i<size;i++){
	            if(a[i]==m) c++;
	    }
	    if(c>size/2) return m;
	    else return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(majorityElement(arr,n));
		sc.close();
	}

}
