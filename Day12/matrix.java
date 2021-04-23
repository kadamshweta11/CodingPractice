package Day12;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        
	        int max = Integer.MIN_VALUE;
	        int sum;
	        
	        for(int i = 0; i <= 3; i++){
	            for(int j = 0; j <= 3; j++){
	                sum = arr[i + 1][j + 1];
	                for(int k = j; k < j + 3; k++){
	                    sum += arr[i][k] + arr[i + 2][k];
	                }            
	                if(sum > max)
	                    max = sum;
	            }
	        }
	        
	        System.out.print(max);
	    }
	}

