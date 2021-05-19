package Day38;

import java.util.Scanner;
//Given an array arr[] and a number K where K is smaller than size of array, 
//the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
public class Kthelement {
	public static void kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println();
                if(i==k-1){
                    System.out.println(k+"largest element="+arr[i]);
                    break;
                }
            
        }
        // return arr[k];
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		kthSmallest(arr,0,n-1,k);
		sc.close();
	}

}
