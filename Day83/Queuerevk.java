package Day83;

import java.util.LinkedList;
import java.util.Queue;

import java.util.Stack;
//Given an integer K and a queue of integers,
//we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.
public class Queuerevk {
	public static Queue<Integer> modifyQueue(Queue<Integer> queue, int k)
    {
      //add code here.
       if (queue.isEmpty() == true
            || k > queue.size())
            return queue;
        if (k <= 0)
            return queue;
 
        Stack<Integer> stack = new Stack<Integer>();
 
       
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
 
        
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }
 
       
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
        return queue;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer> queue = new LinkedList<Integer>();
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
	        queue.add(40);
	        queue.add(50);
	        queue.add(60);
	        queue.add(70);
	        queue.add(80);
	        queue.add(90);
	        queue.add(100);
	 
	        int k = 3;
		System.out.println(modifyQueue(queue,k));
	}

}
