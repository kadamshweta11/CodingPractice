package Day25;

import java.util.Scanner;
//An array contains both positive and negative numbers in random order. Rearrange the array elements so
//that all negative numbers appear before all positive numbers.
public class Array {
	static void NegativeArray(int[] arr,int n)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                if(i!=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
                j++;
                
            }
        }
    }
	static void Print(int[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         NegativeArray(arr,n); 
         Print(arr,n);
         sc.close();
	}

}
