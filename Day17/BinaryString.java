package Day17;

import java.util.Scanner;

public class BinaryString {
	static String add_Binary(String x, String y){
	String res = "";
	int d = 0;
	int k = x.length() - 1, l = y.length() - 1;
	while (k >= 0 || l >= 0 || d == 1) {
	d += ((k >= 0) ? x.charAt(k) - '0' : 0);
	d += ((l >= 0) ? y.charAt(l) - '0' : 0);
	res = (char)(d % 2 + '0') + res;
	d /= 2;
	k--;
				l--;
}
return res;
}
	public static void main(String args[]){
	String x = "011011", y = "1010111";
	System.out.print(add_Binary(x, y));
	}
}
