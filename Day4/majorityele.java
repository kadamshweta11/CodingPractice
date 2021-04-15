package Day4;

import java.util.Scanner;

public class majorityele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
		 nums[i]=sc.nextInt();
		}
		int no=majorityElement(nums);
		System.out.println(no);

	}
	public static int majorityElement(int[] nums) {
        int majority=nums.length/2;
      
        for(int i:nums){
              int count=0;
            for(int j:nums)
            {
                if(i==j)
                {
                    count+=1;
                }
            }
        if(count>majority)
            {
            return i;
            }
        }
        return -1;
    }

}
