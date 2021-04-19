package Day8;

import java.util.Scanner;

public class Array {

	//4
	//1 2 -1 4
	//3 3 3 1
	//1
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        // Write your code here
//	    int t=sc.nextInt();
//	    int a[]=new int[t];
//	    int b[]=new int[t];
//	    int count=0;
//	    int res=0,res2=0;
//	    for(int i=0;i<t;i++)
//	    {
//	        a[i]=sc.nextInt();
//	    }
//	    for(int i=0;i<t;i++)
//	    {
//	        b[i]=sc.nextInt();
//	    }
//	    for(int j=0;j<t;j++){
//	        if(a[j]==-1){
//	            a[j]=b[j];
//	            count++;
//	        }
//	        if(b[j]==-1)
//	        {
//	            b[j]=a[j];
//	            count++;
//	        }
//	      
//	    }
//	    for(int j=0;j<a.length;j++)
//	    {
//	    	res=res+a[j];
//	    }
//	    for(int j=0;j<b.length;j++)
//	    {
//	    	res2=res2+b[j];
//	    }
//	    if(res==res2)
//	    {
//	    System.out.println(res);
//	    System.out.println(count);
//	    }
//	    else {
//	    	System.out.println("Infinite");
//	    }

	    
	    
	    
	    
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
	    int count=0;
	    int res=0,res2=0;
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        b[i]=sc.nextInt();
	    }
	    int aa=0,bb=0,suma=0,sumb=0;

	    for(int i=0;i<n;i++)

	    {

	        if(a[i]>=0)

	suma=suma+a[i];

	        else

	         aa++;

	    }

	    for(int i=0;i<n;i++)

	    {

	        if(b[i]>=0)

	sumb=sumb+b[i];

	        else

	         bb++;

	    }

	    if(aa==0&&bb==1)

	    {

	     if(suma>=sumb)

	     System.out.println(1);

	     else

	         System.out.println(0);

	    }

	    else if(aa==1&&bb==0)

	    {

	        if(sumb>=suma)

	         System.out.println(1);

	        else

	         System.out.println(0);

	    }

	    else if(aa==0&&bb==2)

	    {

	     if(suma>=sumb)

	System.out.println(abs(suma-sumb)+1);

	     else

	     System.out.println(0);

	    }

	    else if(aa==2&&bb==0)

	    {

	        if(sumb>=suma)

	         System.out.println(abs(suma-sumb)+1);

	        else

	         System.out.println(0);

	    }

	    else

	     System.out.println("Infinite");

	

	}

	private static int abs(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}

//}
