package Day29;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
	//Given two integer arrays nums1 and nums2, return an array of their intersection.
public int[] intersectionArray(int[] num1,int[] num2) {
	HashSet<Integer> set=new HashSet<Integer>();
    for(int i:num1){
        set.add(i);
    }
    HashSet<Integer> intersect=new HashSet<Integer>();
    for(int i:num2){
        if(set.contains(i))
        {
            intersect.add(i);
        }
    }
    int[] result=new int[intersect.size()];
    int ind=0;
    for(int i:intersect){
        result[ind++]=i;
    }
    return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] num1=new int[n];
		int[] num2=new int[m];
		for(int i=0;i<n;i++)
		{
			num1[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			num2[i]=sc.nextInt();
		}
		Intersection in=new Intersection();
		System.out.println(in.intersectionArray(num1,num2));
	}

}
