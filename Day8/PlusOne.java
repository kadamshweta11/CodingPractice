package Day8;

import java.util.Scanner;

public class PlusOne {
//Your input[1,2,3]
//	Output[1,2,4]
//	Expected[1,2,4]
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		plusOne(arr);
	}
	public static int[] plusOne(int[] digits) {
		 int check=0;
			if(digits.length<0)
				return digits;
			for(int i=digits.length-1;i>=0;i--)
			{
				if(digits[i]<9)
				{
					digits[i]=digits[i]+1;
					check=0;
					break;
				}
				else {
					digits[i]=0;
					check=1;
					
				}
			}
			if(check==1)
			{
				int result[]=new int[digits.length+1];
				result[0]=check;
				for(int i=1;i<result.length;i++)
				{
					result[i]=digits[i-1];
				}
				return result;
			}
			else
			{
				return digits;
			}
		
		
		
        
    }

}
