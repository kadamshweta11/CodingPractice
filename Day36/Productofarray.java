package Day36;

import java.util.Scanner;
//There is a function signFunc(x) that returns:
//
//1 if x is positive.
//-1 if x is negative.
//0 if x is equal to 0.
//You are given an integer array nums. Let product be the product of all values in the array nums.
public class Productofarray {
	public static int arraySign(int[] nums) {
        double prod=1;
        for(int i=0;i<nums.length;i++){
             prod=prod*nums[i];
        }
            if(prod>0)
            {
                return 1;
            }
            else if(prod<0){
                    return -1;
                }
                else{
                    return 0;
                }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println(arraySign(arr));
	}

}
