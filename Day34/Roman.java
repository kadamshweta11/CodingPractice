package Day34;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
public class Roman {
	 public int romanToInt(String s) {
	        Map<Character,Integer> map=new HashMap();
	        map.put('I',1);
	         map.put('V',5);
	         map.put('X',10);
	         map.put('L',50);
	         map.put('C',100);
	         map.put('D',500);
	         map.put('M',1000);
	        int count=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
	                count+=map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
	            } 
	            else{
	                count+=map.get(s.charAt(i));
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Roman n=new Roman();
		System.out.println(n.romanToInt(s));
	}

}
