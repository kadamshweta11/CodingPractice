package Day37;

import java.util.Scanner;

public class Selectonsort {
	private static void SelectSortsort(int[] arr) {
		
		int temp,j;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i;
			while(j>0 &&arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("before sorting=");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		SelectSortsort(arr);
		System.out.println();
		System.out.println("After sorting=");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
