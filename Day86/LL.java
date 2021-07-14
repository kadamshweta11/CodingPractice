package Day86;

import java.util.LinkedList;

public class LL {
	 static Node head;
	 
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LL list = new LL();
	        list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);
	 
	        System.out.println("Given Linked list");
	        list.printList(head);
	       

}
}
