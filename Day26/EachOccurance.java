package Day26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EachOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Map<Character,Integer> mp=new HashMap<>();
		for(Character c:s.toCharArray()) {
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c,1);
			}
		}
		System.out.println(mp);
		
	}

}
