package Day76;

import java.util.Scanner;
import java.util.Stack;
//Given a stack, the task is to sort it such that the top of the stack has the greatest element.
public class Stackrev {
	public static Stack<Integer> sort(Stack<Integer> st)
	{
		//add code here.
		if(!st.isEmpty()){
		  	int temp=st.pop();
		    	sort(st);
		insert(st,temp);
		}
	
	return st;
	}
	public static void insert(Stack<Integer> st,int x){
	    if(st.isEmpty() || x>st.peek()){
	        st.push(x);
	        return;
	    }
	    int temp=st.pop();
	    insert(st,x);
	    st.push(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sort(null);
		sc.close();
	}

}
