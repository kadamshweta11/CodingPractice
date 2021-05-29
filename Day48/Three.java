package Day48;

import java.util.Scanner;
//Given three distinct numbers A, B and C. Find the number with value in middle
public class Three {
	int middle(int A, int B, int C){
        //code here
        int [] arr=new int[3];
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		Three m=new Three();
	System.out.println( m.middle(A,B,C));
	sc.close();
	}

}
