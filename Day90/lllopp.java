package Day90;
//Write a function findFirstLoopNode() that checks whether
//a given Linked List contains a loop. If the loo
//p is present then it returns point to the first node of the loop. Else it returns NULL.
public class lllopp {
	static class Node
	{
	  int key;
	  Node next;
	};
	static Node newNode(int key)
	{
	  Node temp = new Node();
	  temp.key = key;
	  temp.next = null;
	  return temp;
	}
	static void printList(Node head)
	{
	  while (head != null)
	  {
	    System.out.print(head.key + " ");
	    head = head.next;
	  }
	  System.out.println();
	}
	static Node detectAndRemoveLoop(Node head)
	{
	  // If list is empty or has
	  // only one node without loop
	  if (head == null || head.next == null)
	    return null;
	 
	  Node slow = head, fast = head;
	 
	  // Move slow and fast 1
	  // and 2 steps ahead
	  // respectively.
	  slow = slow.next;
	  fast = fast.next.next;
	 
	  // Search for loop using
	  // slow and fast pointers
	  while (fast != null &&
	         fast.next != null)
	  {
	    if (slow == fast)
	      break;
	    slow = slow.next;
	    fast = fast.next.next;
	  }
	  if (slow != fast)
		    return null;
		 
		  // If loop exists. Start slow from
		  // head and fast from meeting point.
		  slow = head;
		  while (slow != fast)
		  {
		    slow = slow.next;
		    fast = fast.next;
		  }
		 
		  return slow;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = newNode(50);
		  head.next = newNode(20);
		  head.next.next = newNode(15);
		  head.next.next.next = newNode(4);
		  head.next.next.next.next = newNode(10);
		 
		  // Create a loop for testing
		  head.next.next.next.next.next = head.next.next;
		 
		  Node res = detectAndRemoveLoop(head);
		  if (res == null)
		    System.out.print("Loop does not exist");
		  else
		    System.out.print("Loop starting node is " +  res.key);
		}
	}


