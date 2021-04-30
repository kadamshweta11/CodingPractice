package Day19;
import java.util.Arrays;
import java.util.Scanner;

import Day16.MinimumSteps;

public class MinimumSum {
	int getMinDiff(int[] arr, int n, int k) {
        // code here
        if(n==1) return 0;
        Arrays.sort(arr);
        int small=arr[0]+k;
        int big=arr[n-1]-k;
        int temp=0;
        int ans=arr[n-1]-arr[0];
        if(small>big)
        {
            temp=small;
            small=big;
            big=temp;
        }
        for(int i=1;i<n-1;i++)
        {
            int substract=arr[i]-k;
            int add=arr[i]+k;
            if(substract>=small ||add<=big)
                continue;
            if(big-substract<= add-small)
                small=substract;
            else
                big=add;
        }
        return Math.min(ans,big-small);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		MinimumSum m=new MinimumSum();
		System.out.println(m. getMinDiff(arr,n,k));
	}

}
