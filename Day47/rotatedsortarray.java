package Day47;

import java.util.Scanner;

public class rotatedsortarray {
private int search(int[] nums,int target) {
	 if(nums.length==0) return -1;
     int left=0;
     int right=nums.length-1;
   while(left<right){
         int mid=left+(right-left)/2;
         if(nums[mid]>nums[right]){
             left=mid+1;
         }
         else{
             right=mid;
         }
     }
     int start=left;
     left=0;
     right=nums.length-1;
     if(target>=nums[start] && target<=nums[right]){
         left=start;
     }
     else{
         right=start;
     }
   while(left<=right){
       int mid=left+(right-left)/2;
       if(nums[mid]==target){
           return mid;
       }
       else if(nums[mid]<target){
           left=mid+1;
       }
       else{
           right=mid-1;
       }
   }
     return -1;
         
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		rotatedsortarray r=new rotatedsortarray();
		System.out.println(r.search(arr,target));
		sc.close();
	}

}
