package Day61;

import java.util.Random;

public class Generateno {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//approach 1 random
		Random rand=new Random();
		int no=rand.nextInt(100);
		System.out.println("integer random="+no);
		
		double no2=rand.nextDouble();  //by default it will generate from 0.0 less than 1.0
		System.out.println("double random="+no2);
		
		//approach 2 math(by default we can generate decimal no)
		System.out.println(Math.random());
		
	
	}

}
