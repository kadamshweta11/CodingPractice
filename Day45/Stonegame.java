package Day45;

import java.util.Arrays;
import java.util.Scanner;

//Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
//
//The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.
//
//Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.
//
//Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.
public class Stonegame {
	 public boolean stoneGame(int[] piles) {
	        // return true;
	        Arrays.sort(piles);
	        int a=0;
	        int le=0;
	        int i=piles.length-1;
	        int j=i-1;
	        while(j>=0){
	            a+=piles[i--];
	            le+=piles[j--];
	        }
	        return a>le;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements in array=");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Stonegame m=new Stonegame();
		System.out.println(m.stoneGame(arr));
		sc.close();
	}

}
