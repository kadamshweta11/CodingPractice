package Day29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numbers {
	//Given a string in roman no format (s)  your task is to convert it to an integer .
public int RomanInteger(String s) {
	int count=0;
	Map<Character,Integer>map=new HashMap();
	map.put('I',1);
	map.put('V',5);
	map.put('X',10);
	map.put('L',50);
	map.put('C',100);
	map.put('D',500);
	map.put('M',1000);
	for(int i=0;i<s.length();i++)
	{
		if(i>0 && map.get(s.charAt(i))>map.get(s.charAt(i-1)))
		{
			count=count+map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
		}
		else {
			count=count+map.get(s.charAt(i));
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Numbers n=new Numbers();
		System.out.println(n.RomanInteger(s));
	}

}
