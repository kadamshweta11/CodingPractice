package Day43;

import java.util.Scanner;

public class absdiff {
	public int[] getSumAbsoluteDifferences(int[] nums) {
        int  len=nums.length, sum=0, sum2=nums[0];
        for(int x:nums)
            sum+=x;
        nums[0]=sum-(len*nums[0]);
        for(int x=1; x<len; x++) {
            sum2+=nums[x];
            nums[x]=(sum-sum2-nums[x]*(len-x-1))+(nums[x]*x-(sum2-nums[x]));
			
        }
        return nums;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		absdiff d=new absdiff();
		System.out.println(d. getSumAbsoluteDifferences(a));
		sc.close();
	}

}
