package Day98;

public class llsearch {
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

	Node new_node = new Node(new_data);
    new_node.next = null;
	if (head == null) {
       head = new_node;
    }
    else {
       
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }
	
}
public boolean find(int searchkey) {
	if(head==null) return false;
	Node curr=head;
	while(curr!=null) {
		if(curr.data==searchkey) {
			return true;
		}
		curr=curr.next;
	}
	return false;
	
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
		llsearch l=new llsearch();
		l.push(2);
		l.push(4);
		l.push(6);
		l.push(8);
		l.push(10);
		System.out.println("print the linkedlist:");
		l.print();
		if(l.find(18)) {
		System.out.println("found linkedlist");
		}else {
			System.out.println("Not found linkedlist");
		}
		
	}

}
