package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	static int size=10;
	 int[][] sortedMatrix(int N, int Mat[][]) {
	        // code here
	        int temp[]=new int[N*N];
	        int k=0;
	        for(int i=0;i<N;i++)
	        {
	            for(int j=0;j<N;j++){
	            temp[k++]=Mat[i][j];
	            }
	            
	        }
	        Arrays.sort(temp);
	        k=0;
	        for(int i=0;i<N;i++)
	        {
	            for(int j=0;j<N;j++){
	                Mat[i][j]=temp[k++];}
	        }
	        
	        return Mat;
	    }
	    static void printMat(int Mat[][], int N)
	    {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++)
	                System.out.print( Mat[i][j] + " ");
	            System.out.println();
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Mat[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				Mat[i][j]=sc.nextInt();
			}
		}
		Matrix m=new Matrix();
		m.sortedMatrix(N,Mat);
		printMat(Mat,N);
	}

}
