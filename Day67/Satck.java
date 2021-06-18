package Day67;

public class Satck {
	static final int n=100;
	int top;
	int a[]=new int[n];
	boolean push(int x) {
		if(top>=n-1) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+"=pushed into stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x=a[top--];
			return x;
		}
	}
	int peek() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x=a[top];
			return x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Satck s=new Satck();
		s.push(15);
		s.push(8);
		s.push(6);
		System.out.println(s.pop()+"=Popped from stack");
		
	}

	
}
