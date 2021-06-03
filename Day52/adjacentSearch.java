package Day52;

public class adjacentSearch {
	private static int search(int[] arr, int n, int x, int k) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<n) {
			if(arr[i]==x) {
				return i;
			}
			i=i+Math.max(1,Math.abs(arr[i]-x)/k);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 2, 4, 5, 7, 7, 6 };
		int x=6;
		int k=1;
		int n=arr.length;
		System.out.println("element "+x+"is present at "+ search(arr,n,x,k));
	}

	

}
