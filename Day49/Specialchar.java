package Day49;

import java.util.Scanner;

public class Specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char[] special={'@','%','*','!','$','#','^'};
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
			else {
				if(s.charAt(i)==special[i]) {
					count++;
				}
			}
		}
		System.out.println("count ofspecial characters is="+count);
		sc.close();
	}

}
