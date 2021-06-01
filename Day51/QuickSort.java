package Day51;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<=n;i++) {
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {15 ,9 ,7 ,13 ,12 ,16 ,4 ,18 ,11};
		int leng=arr.length;
		QuickSort q=new QuickSort();
		q. quicksortRecur(arr,0,leng-1);
		q.print(arr);
		
//		sc.close();
	}
	int partition(int arr[],int low,int high) {
		int pivot=arr[(low+high)/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	void quicksortRecur(int arr[],int low,int high) {
		int pie=partition(arr,low,high);
		if(low<pie-1) {
			quicksortRecur(arr,low,pie-1);
		}
		if(pie<high) {
			quicksortRecur(arr,pie,high);
		}
	}
	void print(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
