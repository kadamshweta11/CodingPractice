package Day72;

import java.util.Scanner;
import java.util.Stack;
//method 2 for finding the next greater element.
public class nextGrter {
	 public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        // Your code here
	        Stack<Long> st=new Stack<>();
	        int i=n-1;
	       long res[]=new long[n];
	       while(i>=0){
	           if(st.size()==0){
	               res[i]=-1;
	           }
	           else{
	               while(st.size()>0){
	                   if(arr[i]<st.peek()){
	                       break;
	                   }
	                   st.pop();
	               }
	               if(st.size()==0){
	                   res[i]=-1;
	               }
	               else{
	                   res[i]=st.peek();
	               }
	           }
	           st.push(arr[i]);
	           i--;
	       }
	       return res;
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		System.out.println(nextLargerElement(arr,n));
		sc.close();
	}

}
