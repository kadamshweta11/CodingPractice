package Day24;

import java.util.Scanner;
import java.util.Stack;

public class MaxRect {
//	Given a rows x cols binary matrix filled with 0's and 1's, 
//	find the largest rectangle containing only 1's and return its area.
	
		 public static int maximalRectangle(int[][] a1) {
		       
		        if(a1.length==0) return 0;
		         int max=0;
		        int[] height=new int[a1[0].length];
		        for(int i=0;i<a1.length;i++)
		        {
		            for(int j=0;j<a1[0].length;j++)
		            {
		                if(a1[i][j]==0)
		                {
		                    height[j]=0;
		                }
		                else{
		                    height[j]+=1;
		                }
		            }
		            max=Math.max(max,findArea(height));
		        }
		        return max;
		    }
		    static int findArea(int[] height){
		        int max=0;
		        Stack<Integer> s=new Stack<>();
		        s.add(0);
		        for(int i=1;i<height.length;i++)
		        {
		            int curr=height[i];
		            if(s.isEmpty() || curr>=height[s.peek()])
		            {
		                s.add(i);
		            }
		            else{
		                while(!s.isEmpty() && curr<height[s.peek()]){
		                    int temp=height[s.pop()];
		                    if(s.isEmpty()){
		                        max=Math.max(max,temp*i);
		                    }
		                    else{
		                        max=Math.max(max,temp*(i-s.peek()-1));
		                    }
		                }
		                s.add(i);
		            }
		        }
		        if(!s.isEmpty()){
		             while(!s.isEmpty()){
		                 int i=height.length;
		                    int temp=height[s.pop()];
		                    if(s.isEmpty()){
		                        max=Math.max(max,temp*i);
		                    }
		                    else{
		                        max=Math.max(max,temp*(i-s.peek()-1));
		                    }
		                }
		        }
		        return max;
		            
		    }
		    public static void main(String[] args) {
		    	Scanner sc=new Scanner(System.in);
		    	int row=sc.nextInt();
		    	int col=sc.nextInt();
		    	int a1[][]=new int[row][col];
		    	for(int i=0;i<row;i++)
		    	{
		    		for(int j=0;j<col;j++)
		    		{
		    			a1[i][j]=sc.nextInt();
		    		}
		    	}
		    	System.out.println( maximalRectangle(a1));
		    	
				// TODO Auto-generated method stub
		    }
	}


