package Day67;

import java.util.Scanner;
import java.util.Stack;

public class RevStack {
//java to reverse string using stack
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			st.push(s.charAt(i));
		}
		System.out.println("reverse a string");
		while(!st.empty()) {
			System.out.print(st.pop());
		}
		sc.close();
	}

}
