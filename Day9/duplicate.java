package Day9;
import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		//Given an array a[] of size N which contains elements from 0 to
		//N-1, you need to find all the elements occurring more than once in the given array.
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				
			}
		
	        for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                   System.out.println(arr[j]);
	                }
	               
	                	
	                
	            }
	        }
	        System.out.println("-1");
	        
	    }
	    
	}
	    


