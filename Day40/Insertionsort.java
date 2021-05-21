package Day40;

public class Insertionsort {

	public static void main(String[] args) {
		// Perform insertion sort on the given array
int[] a= {5,2,1,6,3,4};
int temp,j;
for(int i=1;i<a.length;i++) {
 temp=a[i];
	j=i;
	while(j>0 &&a[j-1]>temp) {
		a[j]=a[j-1];
		j=j-1;
	}
	a[j]=temp;
}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
	}

}
