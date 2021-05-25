package Day43;

import java.util.Scanner;

public class zeros {
	///Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	public int[] moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
		return nums;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=4;
		int nums[]= {0,1,0,3,12};
		zeros z=new zeros();
		System.out.println(z.moveZeroes(nums));
		
		sc.close();
	}

}
