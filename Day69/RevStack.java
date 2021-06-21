package Day69;

import java.util.Scanner;
import java.util.Stack;

public class RevStack {
public static void reverse(Stack<Integer> st) {
	if(st.isEmpty()) {
		return;
	}
	int temp=st.pop();
	reverse(st);
	insertLast(st,temp);
}
public static void insertLast(Stack<Integer> stack,int el) {
	if(stack.isEmpty()) {
		stack.push(el);
		return;
	}
	int topel=stack.pop();
	insertLast(stack,el);
	stack.push(topel);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st=new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		System.out.println(st);
		System.out.println(st);
		reverse(st);
		
	}

}
