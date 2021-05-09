package Day28;

import java.util.Scanner;

public class longPress {
	 public static boolean isLongPressedName(String name, String typed) {
	        int i=0;
	        int j=0;
	        while(i<name.length() && j<typed.length())
	        {
	            if(name.charAt(i)==typed.charAt(j)) {
	                i++;
	                j++;
	            }
	            else if(i>0 && name.charAt(i-1)==typed.charAt(j))
	                j++;
	            else{
	                return false;
	            }
	        }
	        while(j<typed.length())
	        {
	            if(typed.charAt(j)!=name.charAt(i-1)) return false;
	            j++;
	        }
	        return i< name.length()?false:true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String typed=sc.next();
		System.out.println(isLongPressedName(name,typed));
	}

}
