package Day92;

public class Listop {
private ListNode head;

private static class ListNode {
	private int data;
	private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=next;
		}
	
}
public void print() {
	ListNode curr=head;
	while(curr!=null) {
		System.out.print(curr.data+"...");
		curr=curr.next;
	}
	System.out.println("null");
}
public int length() {
	if(head==null) {
		return 0;
	}
	int count=0;
	ListNode curr=head;
	while(curr!=null) {
		count++;
		curr=curr.next;
	}
	return count;
}
public void insertfirst(int val) {
	ListNode newNode=new ListNode(val);
	newNode.next=head;
	head=newNode;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Listop ll=new Listop();
ll.insertfirst(4);
ll.insertfirst(7);
ll.print();
	}

}
