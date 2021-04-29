package Day18;

import java.util.Scanner;

public class Subset {

	 static boolean isSubset(int arr1[],int arr2[],int m, int n)
{
int i = 0;
int j = 0;
for (i = 0; i < n; i++) {
for (j = 0; j < m; j++)
 if (arr2[i] == arr1[j])
     break;

/* If the above inner loop
was not broken at all then
arr2[i] is not present in
arr1[] */
if (j == m)
 return false;
}

/* If we reach here then all
elements of arr2[] are present
in arr1[] */
return true;
}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1[]= {11,12,13,14,15,16};
		int a2[]= {1,2,4};
		int m = a1.length;
        int n = a2.length;
	 
	        if (isSubset(a1, a2, m, n))
	            System.out.print("arr2[] is "
	                             + "subset of arr1[] ");
	        else
	            System.out.print("arr2[] is "
	                             + "not a subset of arr1[]");

	}

}
