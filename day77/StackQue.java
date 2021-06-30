package day77;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Implement a Stack using two queues q1 and q2.
public class StackQue {
	  Queue<Integer> q1 = new LinkedList<Integer>();
	    Queue<Integer> q2 = new LinkedList<Integer>();
	    
	    //Function to push an element into stack using two queues.
	    void push(int a)
	    {
		    // Your code here
		    q1.add(a);
	    }
	    
	    //Function to pop an element from stack using two queues. 
	    int pop()
	    {
		    // Your code here
		    if(q1.isEmpty()){
		        return -1;
		    }
		    while(q1.size()!=1){
		        q2.add(q1.remove());
		    }
		    int val=q1.remove();
		    Queue<Integer> t=q1;
		    q1=q2;
		    q2=t;
		    return val;
	    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackQue a=new StackQue();
		a.push(2);
		a.push(3);
		a.push(5);
		System.out.println(a.pop());
		System.out.println(a.pop());
		a.push(6);
		System.out.println(a.pop());
		System.out.println(a.pop());
		
		System.out.println(a.pop());
		}
	}


