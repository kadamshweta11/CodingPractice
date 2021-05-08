package Day27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Convert the date string to the format YYYY-MM-DD, where:
//
//YYYY denotes the 4 digit year.
//MM denotes the 2 digit month.
//DD denotes the 2 digit day.
public class ReformatDate {

	public String reformatdate(String date)
	{
		Map<String,String>months=new HashMap<String,String>();
		months.put("Jan","01");
		months.put("Feb","02");
		months.put("Mar","03");
		months.put("Apr","04");
		months.put("May","05");
		months.put("Jun","06");
		months.put("Jul","07");
		months.put("Aug","08");
		months.put("Sep","09");
		months.put("Oct","10");
		months.put("Nov","11");
		months.put("Dec","12");
		
		String arr[]=date.split(" ");
		StringBuffer b=new StringBuffer();
		for(char ch:arr[0].toCharArray())
		{
			if(ch>='0' && ch<='9')
			{
				b.append(ch);
			}
			else
			{
				break;
			}
			
		}
		if(b.length()==1)
		{
			b.insert(0,'0');
		}
		return arr[2]+"-"+months.get(arr[1])+"-"+b.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		ReformatDate d=new ReformatDate();
		System.out.println(d.reformatdate(date));
		sc.close();
	}

}
