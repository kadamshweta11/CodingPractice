package Day73;

import java.util.Scanner;
import java.util.Stack;
//A celebrity is a person who is known to all but does not know anyone at a party. If you go to
//a party of N people, find if there is a celebrity in the party or not.
//A square NxN matrix M[][] is used to represent people at the party such that if
//an element of row i and column j  is set to 1 it means ith person knows jth person. 
//Here M[i][i] will always be 0.
public class CelebProb {
	int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> s=new Stack<>();
    	for(int i=0;i<M.length;i++){
    	    s.push(i);
    	}
    	while(s.size()>=2){
    	    int i=s.pop();
    	    int j=s.pop();
    	    if(M[i][j]==1){
    	        s.push(j);
    	    }else{
    	        s.push(i);
    	    }
    	}
    	int pot=s.pop();
    	for(int i=0;i<M.length;i++){
    	    if(i!=pot){
    	        if(M[i][pot]==0 || M[pot][i]==1){
    	            return -1;
    	        }
    	    }
    	}
    	return pot;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			arr[i][i]=sc.nextInt();
			}
		}
		CelebProb c=new CelebProb();
		System.out.println(c.celebrity(arr,n));
	}

	

}
