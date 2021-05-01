package Day20;

public class Shuffle {

	static boolean checkShuffle(String first,String second,String result)
	{
		if(first.length()+second.length()!=result.length())
		{
		return false;
		}
		int i=0,j=0,k=0;
		while(k!=result.length())
		{
			if(i<first.length() && first.charAt(i)==result.charAt(k))
			{
				i++;
			}
			else if(j<second.length() && second.charAt(j)==result.charAt(k))
			{
				j++;
			}
			else {
				return false;
				}
			k++;
		}
			if(i<first.length() ||j<second.length())
			{
				return false;
			}
			return true;
		}
		
		
	
	public static void main(String[] args) {
		// Java Program to Check if a string is a valid 
		//shuffle of two distinct strings
		String first="XY";
		String second="12";
		String result[]= {"1XY2","Y12X"};
		for(String results:result) {
		if(checkShuffle(first, second, results)==true)
		{
			System.out.println(results +"is valid string of"+first+","+second);
		}
		else {
			System.out.println(results +"is not valid string of"+first+","+second);
		}
		}

	}

}
