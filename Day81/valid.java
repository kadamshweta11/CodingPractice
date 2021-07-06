package Day81;

import java.util.Scanner;
import java.util.Stack;

public class valid {
	static int findMaxLen(String str) {
        // code here
        int n = str.length();
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int result = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) == '(')
                stk.push(i);
            else
            {
                if(!stk.empty())
                    stk.pop();
                if (!stk.empty())
                    result
                        = Math.max(result,
                                   i - stk.peek());
                else
                    stk.push(i);
            }
        }
 
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(findMaxLen(str));
		sc.close();
	}

}
