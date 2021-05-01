package Day20;

public class LongestPalindrome {

	/////////////////////////c++ solution////////////////////
	//Given a string S, find the longest palindromic substring in S.
//	#include<iostream>
//	using namespace std;
//	string longestPalin(string s)
//	int main()
//	{
//		int y;
//		cin>>t;
//		while(t--)
//		{
//			String s;
//			cin>>s;
//			cout<<longestPalin(s)<<endl;
//		}
//	}
//		void PrintString(string s,int start,int end)
//		{
//		    for(int i=start;i<=end;i++)
//		    {
//		        cout<<s[i];
//		    }
//		}
//		string longestPalin (string s)
//		{
//		    // your code here
//		     int low,high;
//		        int start=0;
//		        int end=1;
//		        for(int i=1;i<s.length();i++){
//		            low=i-1;
//		            high=i;
//		            while(low>=0 &&high<s.length()&& s[low]==s[high])
//		            {
//		                if(high-low+1>end)
//		                {
//		                    start=low;
//		                    end=high-low+1;
//		                }
//		                low--;
//		                high++;
//		            }
//		            //odd
//		            low=i-1;
//		            high=i+1;
//		            while(low>=0 &&high<s.length()&& s[low]==s[high])
//		            {
//		                if(high-low+1>end)
//		                {
//		                    start=low;
//		                    end=high-low+1;
//		                }
//		                low--;
//		                high++;
//		            }
//		        }
//		        PrintString(s,start,start+end-1);
//		}
//	}
//
}
