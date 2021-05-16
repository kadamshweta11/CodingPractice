package Day35;

import java.util.Scanner;
//Given a string s of zeros and ones, return the maximum score after splitting 
//the string into two non-empty substrings (i.e. left substring and right substring).
public class splitting {

	 public static int maxScore(String s) {
	        int zero=0;
	        int left=0;
	        int max=0;
	       
	        for(char a:s.toCharArray()) {
	            if(a=='0'){
	            zero++;}
	        }
	         int right=s.length()-zero;
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)=='0'){
	                left++;
	            }
	            else if(s.charAt(i)=='1'){
	                right--;
	            }
	            max=Math.max(max,left+right);
	        }
	        return max;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
System.out.println(maxScore(s));
	}

}
