package Day42;

import java.util.Scanner;
//Given an array of size n and a range [a, b]. 
//The task is to partition the array around the range such that array is divided into three parts.
public class Partition {
	 public static void Partitions(int array[], int a, int b)
	    {
	        // code here
	        int l=0;
	        int r=array.length-1;
	        for(int i=0;i<=r;i++){
	            if(array[i]<a){
	               
	                int temp=array[i];
	                array[i]=array[l];
	                array[l]=temp;
	                l++;
	            }
	            else if(array[i]>b){
	               
	                int temp=array[i];
	                array[i]=array[r];
	                array[r]=temp;
	                r--;
	                i--;
	            }
	        }
			
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	System.out.println("enter value of a and b from array=");
	int a1=sc.nextInt();
	int b1=sc.nextInt();
		System.out.println(Partitions(a,a1,b1));
		sc.close();
	}

}
