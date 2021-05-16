package Day35;

import java.util.*;
import java.util.Scanner;
//Every valid email consists of a local name and a domain name,
//separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
public class uniquemail {
public int uniquestring(String[] email) {
	Set<String> st=new HashSet<>();
	for(String emails:email) {
	String[] tmp=emails.split("@");
	
	String[] local=tmp[0].split("\\+");
	st.add(local[0].replace(".", "")+"@"+ tmp[1]);
	
	}
	return st.size();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] email=new String[size];
		for(int i=0;i<=size;i++)
		{
			email[i]=sc.nextLine();
		}
		uniquemail e=new uniquemail();
		System.out.println(e.uniquestring(email));
		sc.close();
	}

}
