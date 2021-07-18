package Day89;

import java.util.HashSet;
import java.util.LinkedList;
//Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

public class loopll {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	 public static boolean detectLoop(Node head){
	        // Add code here
	        if(head==null) return false;
	        HashSet<Node>m=new HashSet<Node>();
	        while(head!=null){
	            if(m.contains(head)){
	               return true;
	            }
	           m.add(head);
	           head=head.next;
	        }
	        return false;
	    }
	 public static void push(int new_data) {
		 Node new_node = new Node(new_data);

	        
	        new_node.next = head;

	       
	        head = new_node;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList llist = new LinkedList();
		
	        llist.push(20);
	        llist.push(4);
	        llist.push(15);
	        llist.push(10);

	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;

	        if (detectLoop(head))
	            System.out.println("Loop found");
	        else
	            System.out.println("No Loop");
	}
}

