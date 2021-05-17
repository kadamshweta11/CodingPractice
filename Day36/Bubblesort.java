package Day36;

import java.util.Scanner;
//Perform bubble sort operation on the given array
public class Bubblesort {
	private static void bubblesort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		bubblesort(arr);
		System.out.println();
		System.out.println("After sorting=");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
