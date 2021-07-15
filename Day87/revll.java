package Day87;

//Given pointer to the head 
//node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing the links between nodes.
public class revll {
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
    Node reverse(Node node) {
    	Node prev=null;
    	Node curr=node;
    	Node next=null;
    	while(curr!=null) {
    		next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	node=prev;
    	return node;
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
		revll list=new revll();
		list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed Linked list");
        list.printList(head);
	}

}
