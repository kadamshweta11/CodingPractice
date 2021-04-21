package Day10;
import java.util.Scanner;
public class moves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // Write your code here

        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            System.out.println(1l*n*(n+1));
        }
	}

}
