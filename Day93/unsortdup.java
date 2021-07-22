package Day93;
//Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List
//. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.
public class unsortdup {
	static Node head;
	 class Node{
			int data;
			Node next;
			Node(int d){
				data=d;
				next=null;
			}
	 }
	 void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	public Node removeDuplicates(Node head) 
    {
         // Your code here
         Node ptr1=null,ptr2=null,dup=null;
         ptr1=head;
         while(ptr1!=null && ptr1.next!=null){
             ptr2=ptr1;
             while(ptr2.next!=null){
                 if(ptr1.data==ptr2.next.data){
                     dup=ptr2.next;
                     ptr2.next=ptr2.next.next;
                       System.gc();
                 }
                 else{
                     ptr2=ptr2.next;
                 }
             }
             ptr1=ptr1.next;
         }
         return head;
    }
	public void main(String[] args) {
		// TODO Auto-generated method stub
unsortdup list=new unsortdup();
list.head = new Node(10);
list.head.next = new Node(12);
list.head.next.next = new Node(11);
list.head.next.next.next = new Node(11);
list.head.next.next.next.next = new Node(12);
list.head.next.next.next.next.next = new Node(11);
list.head.next.next.next.next.next.next
    = new Node(10);
System.out.println(
        "Linked List before removing duplicates : \n ");
    list.printList(head);

    list.removeDuplicates( head);
    System.out.println("");
    System.out.println(
        "Linked List after removing duplicates : \n ");
    list.printList(head);

	}

}
