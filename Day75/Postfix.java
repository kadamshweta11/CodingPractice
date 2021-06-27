package Day75;

import java.util.Scanner;
import java.util.Stack;
//Given string S representing a postfix expression, the task is to 
//evaluate the expression and find the final value. Operators will only
//include the basic arithmetic operators like *, /, + and -.
public class Postfix {
	 public static int evaluatePostFix(String exp)
	    {
	        Stack<Integer> s=new Stack<>();
	        for(int i=0;i<exp.length();i++){
	            char c=exp.charAt(i);
	            if(Character.isDigit(c)){
	                s.push(c-'0');
	            }else{
	                int val1=s.pop();
	                int val2=s.pop();
	                switch(c){
	                    case '+':
	                        s.push(val2+val1);
	                        break;
	                    case '-':
	                        s.push(val2-val1);
	                        break;
	                    case '/':
	                        s.push(val2/val1);
	                        break;
	                    case '*':
	                        s.push(val2*val1);
	                        break;
	                }
	            }
	        }
	        return s.pop();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(evaluatePostFix(s));
		sc.close();
	}

}
