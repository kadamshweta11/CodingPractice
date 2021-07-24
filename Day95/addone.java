package Day95;
//A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

public class addone {
	static Node head; 
	   
    static class Node
    {
        int data;
        Node next;
        Node(int d) {
        	data = d; 
        next = null;
        }
    }
	static Node addOneUtil(Node head)
    {
     
        Node res = head;
        Node temp = null, prev = null;
 
        int carry = 1, sum;
 
        while (head != null) // while both lists exist
        {
            sum = carry + head.data;
 
            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
 
        if (carry > 0)
            temp.next = new Node(carry);
        return res;
    }
	static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
	static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }
	 public static Node addOne(Node head) 
	    { 
	   
	         head = reverse(head);

	        head = addOneUtil(head);
	        return reverse(head);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        System.out.print("List is ");
        printList(head);
 
        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
	}

}
