package Day94;

public class llmove {
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
	 void moveToFront()
	    {
	       
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
	 public void push(int new_data)
	    {
	      
	        Node new_node = new Node(new_data);
	   
	        new_node.next = head;
	   
	        head = new_node;
	    }
void printList()
{
    Node temp = head;
    while(temp != null)
    {
       System.out.print(temp.data+" ");
       temp = temp.next;
    }  
    System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llmove l=new llmove();
		l.push(12);
		l.push(13);
		l.push(14);
		l.push(15);
		l.push(16);
		l.push(11);
		System.out.println("before moving =");
		l.printList();
		l.moveToFront();
		System.out.println("after moving=");
		l.printList();
	}

}
