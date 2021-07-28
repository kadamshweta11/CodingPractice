package Day99;
//Write a function that moves the last element to the front in a given 
//Singly Linked List. For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
public class movell {
static Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public void push(int new_data) {
	Node new_node=new Node(new_data);
	new_node.next=null;
	if(head==null) {
		head=new_node;
	}else {
		Node last =head;
		while(last.next!=null) {
			last=last.next;
		}last.next=new_node;
	}
}

public void moveFront() {
	if(head == null || head.next == null) 
        return;

  Node secLast = null;
  Node last = head;
  while (last.next != null)  
  {
     secLast = last;
     last = last.next; 
  }

  secLast.next = null;
  last.next = head;
  head = last;
	
}
public void print() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movell l=new movell();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.push(50);
		l.push(9);
		System.out.println("before moving last element to first=");
		l.print();
		l.moveFront();
		System.out.println("after moving last elment to first=");
		l.print();
	}

}
