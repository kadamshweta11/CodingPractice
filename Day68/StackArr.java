package Day68;

public class StackArr {
	int top=0;
	int max=5;
	int a[]=new int[max];
	private boolean isfull() {
		if(top==max)
		{
			return true;
			}
		return false;
		}
	public void insert(int val) {
		if(isfull()) {
			System.out.println("stack is full!");
			return;
		}
		a[top++]=val;
	}
	private boolean isEmpty() {
		if(top==0) {
			return true;
		}
		return false;
	}
	public int remove() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		return a[--top];
	}
	public int top() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		return a[top-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArr a=new StackArr();
		a.insert(10);
		a.insert(20);
		a.insert(30);
		a.insert(40);
		a.insert(50);
		a.insert(60);
		a.insert(70);
		System.out.println("removed element="+a.remove());
		a.insert(70);
		System.out.println("top="+ a.top());
		System.out.println("removed element="+a.remove());
		System.out.println("removed element="+a.remove());
		System.out.println("removed element="+a.remove());
		System.out.println("removed element="+a.remove());
		System.out.println("removed element="+a.remove());
		System.out.println("removed element="+a.remove());
		System.out.println("removed element="+a.remove());

	}

}
