package Day60;

import java.util.Scanner;
//Given an array nums[] of size n, construct a Product Array P 
//(of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].
public class Product {
	public static int[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
       
        int left[]=new int[n];
        int right[]=new int[n];
      int prod[]=new int[n];
        int i,j;
        left[0]=1;
        right[n-1]=1;
        for(i=1;i<n;i++){
            left[i]=arr[i-1]*left[i-1];
        }
        for(j=n-2;j>=0;j--){
            right[j]=arr[j+1]*right[j+1];
        }
        for(i=0;i<n;i++){
            prod[i]=left[i]*right[i];
        }
        return prod;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		productExceptSelf(arr,n);
		sc.close();
	}

}
