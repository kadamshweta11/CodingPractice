package Day24;

import java.util.Scanner;
import java.io.*;
import java.net.InetAddress;
public class Subnet1 {

	public static void main(String[] args) {
		//Write a program to demonstrate subnetting and find the subnet masks.
			   
		        System.out.println("ENTER IP:");
		       Scanner sc=new Scanner(System.in);
		        String ip =sc.next();
		        String checkclass = ip.substring(0, 3);



		        int cc = Integer.parseInt(checkclass);
		        String mask = null;
		        if(cc>0)
		        {
		            if(cc<=127)
		            {
		                mask = "255.0.0.0";
		        System.out.println("Class A IP Address");
		        System.out.println("SUBNET MASK:\n"+mask);
		            }
		            if(cc>=128 && cc<=191)
		            {
		                mask = "255.255.0.0";
		        System.out.println("Class B IP Address");
		        System.out.println("SUBNET MASK:\n"+mask);
		            }
		            if(cc>=192 && cc<=223)
		            {
		                mask = "255.255.255.0";
		        System.out.println("Class C IP Address");
		        System.out.println("SUBNET MASK:\n"+mask);
		            }
		        if(cc>=224 && cc<=239)
		            {
		        mask = "255.0.0.0";
		                System.out.println("Class D IP Address Used for multicasting");
		            }
		            if(cc>=240 && cc<=254)
		            {
		        mask = "255.0.0.0";
		                System.out.println("Class E IP Address Experimental Use");
		            }
		        }
		      

		        String networkAddr="";
		    String lastAddr="";
		        String[] ipAddrParts=ip.split("\\.");
		        String[] maskParts=mask.split("\\.");

		        for(int i=0;i<4;i++){
		        int x=Integer.parseInt(ipAddrParts[i]);
		        int y=Integer.parseInt(maskParts[i]);
		        int z=x&y;
		        networkAddr+=z+".";
		    int w=z|(y^255);
		    lastAddr+=w+".";
		        }
		   
		    System.out.println("First IP of block: "+networkAddr);
		    System.out.println("Last IP of block: "+lastAddr);
		    sc.close();
	}

}
