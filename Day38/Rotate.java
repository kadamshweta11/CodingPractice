package Day38;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
         
      int x=arr[arr.length-1];
      for(int i=arr.length-1;i>0;i--) {
    	  arr[i]=arr[i-1];
    	  
      }
      arr[0]=x;
         
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
