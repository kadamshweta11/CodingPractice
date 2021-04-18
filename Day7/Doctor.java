package Day7;

import java.util.Scanner;

public class Doctor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Write your code here
        int length=sc.nextInt();
        int noOfPage=sc.nextInt();
        if(length<=23)
        {
            if(noOfPage>499 && noOfPage<1001)
            {
            System.out.println("Take Medicine");
            }
        }
        else
        {
            System.out.println("Don't take Medicine");
        }
	}

}
