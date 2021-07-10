package Day84;
//Given a Queue Q containing N elements.
//The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revQueue {
	 static Queue<Integer> queue;
	public static Queue<Integer> rev(Queue<Integer> queue){
        //add code here.
         Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        return queue;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println(rev(queue));
	}

}
