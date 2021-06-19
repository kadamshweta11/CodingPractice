package Day68;

import java.util.Scanner;
import java.util.Stack;

public class StackOp {
//Given an input array print the next greater element of input array in O(N) time complexity
	public static void Large(int arr[]) {
		if(arr.length==0) {
			return ;
		}
		Stack<Integer> s=new Stack<>();
		s.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			while(!s.isEmpty() && arr[i]>s.peek()) {
				s.pop();
				System.out.print(arr[i]+" ");
			}
			s.push(arr[i]);
		}
		while(!s.isEmpty()) {
			System.out.println(-1);
			s.pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Large(arr);
		sc.close();
		
	}

}
