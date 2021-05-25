package Day44;

import java.util.HashMap;
import java.util.Map;



public class commanElements {
	static int m=4;
	static int n=5;
	private static void commanEle(int[][] arr) {
		Map<Integer,Integer> mp=new HashMap<>();
		for(int j=0;j<n;j++) {
			mp.put(arr[0][j], 1);
			
		}
		for(int i=1;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mp.get(arr[i][j])!=null && mp.get(arr[i][j])==i){
					mp.put(arr[i][j], i+1);
					
					if(i==m-1) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[][]= {
				{1, 2, 1, 4, 8},
		        {3, 7, 8, 5, 1},
		        {8, 7, 7, 3, 1},
		        {8, 1, 2, 7, 9},
		};
		System.out.println("comman elements in each row are:");
		commanEle(arr);

	}

	

}
