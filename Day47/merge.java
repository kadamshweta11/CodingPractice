package Day47;

import java.util.Scanner;
//Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
public class merge {
	 public void merge1(int arr1[], int arr2[], int n, int m) {
	        // code here
	        int space=n+m;
	        int i=0;
	        int j=0;
	        for(space=nextspace(space);space>0;space=nextspace(space)){
	            for( i=0;i+space<n;i++){
	                if(arr1[i]>arr1[i+space]){
	                    arr1[i]+=arr1[i+space]-(arr1[i+space]=arr1[i]);
	                }
	                
	            }
	            for(j=(space>n)?(space-n):0;i<n && j<m;i++,j++){
	                if(arr1[i]>arr2[j]){
	                    arr1[i]+=arr2[j]-(arr2[j]=arr1[i]);
	                }
	            }
	            if(j<m){
	                for( j=0;j+space<m;j++){
	                    if(arr2[j]>arr2[j+space]){
	                        arr2[j]+=arr2[j+space]-(arr2[space+j]=arr2[j]);
	                    }
	                }
	            }
	        }
	    
	    }
	    int nextspace(int space){
	        if(space<=1){
	             return 0;
	        }
	    
	    return(space/2 + space%2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int [] arr2=new int[m];
		
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		merge m1=new merge();
		m1.merge1(arr1,arr2,n,m);
		sc.close();
	}

}
