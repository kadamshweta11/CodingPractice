package Day6;

import java.util.Scanner;

public class School {


    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       
        // Write your code here
        
        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int n3 = sc.nextInt();


 

        int max = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);

System.out.println(max);


    
}

}
