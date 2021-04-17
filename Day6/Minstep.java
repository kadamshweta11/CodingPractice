package Day6;

import java.util.Scanner;

public class Minstep {


   public static void main(String args[] ) throws Exception

{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0)
{
int k = sc.nextInt();
int m = sc.nextInt();
int n = sc.nextInt();
int count=0;
int x=0;
while(k<m)
{
    if(m%n==0)
    {
    m=m/n;
    count++;
    }
    else
    { 
        x=(n-(m%n));
        m+=(n-(m%n))/2*2+(n-(m%n))%2;
        count+=x/2+x%2;
    }
}
    if(k>m)
    {
        count+=(k-m)/2+(k-m)%2;
    }
System.out.println(count);
}
}
}


