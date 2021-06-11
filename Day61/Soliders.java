package Day61;

import java.util.Scanner;
//Bishu went to fight for Coding Club. There were N soldiers with various powers. There will be Q rounds to fight and in 
//each round, Bishu's power will be varied. With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M).
//After each round, All the soldiers who are dead in the previous round will reborn. Such that in each round there will be N soldiers to fight.
//As Bishu is weak in mathematics, 
//help him to count the number of soldiers that he can kill in each round and the total sum of their powers
public class Soliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i=0;i<n;i++){
	           arr[i]=sc.nextInt();
	       }    
	       int t=sc.nextInt();
	       while(t-->0){
	           int sum=0,count=0;
	           int p=sc.nextInt();
	           for(int i=0;i<n;i++){
	               if(arr[i]<=p){
	                   sum+=arr[i];
	                   count++;
	               }
	              
	           }
	            System.out.println(count+" "+ sum);

	       }             
	}

}
