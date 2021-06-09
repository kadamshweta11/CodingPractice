package Day59;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 boolean found=false;
	        Set<Integer>set=new HashSet<>();
	        int sum=0;
	        for(long ele:arr){
	            set.add(sum);
	            sum+=ele;
	            if(set.contains(sum)){
	                found=true;
	             
	                break;
	            }
	}
	        System.out.println(found);
	      
	        sc.close();
	}
}


