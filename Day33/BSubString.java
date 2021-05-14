package Day33;

import java.util.Scanner;

public class BSubString {
//count the repeated words in string using java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String[] word=str.split(" ");
		int count;
		for(int i=0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
				
			}
			if(word[i]!="0") {
				System.out.println(word[i]+" "+count);
			}
		}
		sc.close();
	}

}
