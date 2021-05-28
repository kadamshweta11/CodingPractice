package Day46;

import java.util.Scanner;

public class squares {
public int count(int N) {
	 int a=(int) Math.sqrt(N);
     if(a*a==N) return a-1;
     else return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		squares s=new squares();
		System.out.println(s.count(n));
		sc.close();
	}

}
