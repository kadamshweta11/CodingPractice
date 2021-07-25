package Day96;

public class llength {
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
		new_node.next=head;
		head=new_node;
	}
	public void printlist() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
//Iterative approach
	public int printLength() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	//Recursive approach
	public int reclength(Node node) {
		if(node==null) {
			return 0;
		}
		else {
			return 1+reclength(node.next);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
llength l=new llength();
l.push(14);
l.push(15);
l.push(16);
l.push(17);
l.printlist();
System.out.println("length of the linkedlist using iterative method is="+ l.printLength());
System.out.println("length of the linkedlist using recursive method is="+ l.reclength(l.head));
	}

}
