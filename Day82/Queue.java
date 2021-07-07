package Day82;

import java.util.Stack;
//Implement a Queue using 2 stacks s1 and s2 .
//A Query Q is of 2 Types
//(i) 1 x (a query of this type means  pushing 'x' into the queue)
//(ii) 2   (a query of this type means to pop element from queue and print the poped element)
public class Queue {
	 Stack<Integer> s1 = new Stack<Integer>();
	    Stack<Integer> s2 = new Stack<Integer>();

	    //Function to push an element in queue by using 2 stacks.
	    void Push(int x)
	    {
		   // Your code here
		   while (!s1.isEmpty())
	        {
	            s2.push(s1.pop());
	            //s1.pop();
	        }
	 
	        // Push item into s1
	        s1.push(x);
	 
	        // Push everything back to s1
	        while (!s2.isEmpty())
	        {
	            s1.push(s2.pop());
	            //s2.pop();
	        }
	    }
		
	    
	    //Function to pop an element from queue by using 2 stacks.
	    int Pop()
	    {
		   // Your code here
		  if (s1.isEmpty())
	        {
	            return -1;
	        }
	 
	        // Return top of s1
	        int x = s1.peek();
	        s1.pop();
	        return x;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.Push(6);
		q.Push(10);
		q.Push(14);
		q.Push(18);
		q.Push(20);
		System.out.println(q.Pop());
		System.out.println(q.Pop());
		System.out.println(q.Pop());
		

	}

}
