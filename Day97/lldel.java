package Day97;

public class lldel {
static Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data =d;
		next=null;
	}
}
public Node deleteLast() {
	if(head==null) return head;
	if(head.next==null) {
		Node temp=head;
		head=head.next;
		return temp;
	}
	Node curr=head,prev=null;
	while(curr.next!=null) {
		prev=curr;
		curr=curr.next;
	}
	prev.next=null;
	
	return curr;
	
}
public void push(int new_data) {
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
}
public void print() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
lldel l=new lldel();
l.push(10);
l.push(20);
l.push(30);
l.push(40);
l.push(50);
System.out.println("before deleting last node:");
l.print();
l.deleteLast();
System.out.println("After deleting last node:");
l.print();

	}

}
