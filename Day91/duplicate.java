package Day91;

public class duplicate {
 Node head;
 class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
duplicate d=new duplicate();
d.push(12);
d.push(12);
d.push(12);
d.push(15);
d.push(19);
System.out.println("List before removal of duplicates");
d.print();
d.removedupli();
System.out.println("List after removal of duplicates");
d.print();
	}
	 void print() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	 void removedupli() {
		// TODO Auto-generated method stub
		Node curr = head;
		 
      
        while (curr != null) {
             Node temp = curr;
           
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
           
            curr.next = temp;
            curr = curr.next;
        }
		
	}
	void push(int new_data) {
		// TODO Auto-generated method stub
		Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
		
	}

}
