/*validate the ip address in the form a.b.c.d
   where a,b,c,d must be between 0and 255
   if validated return 1 else return 2*/

package Assingment3;

import java.util.StringTokenizer;

public class Assing3_26 {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("1z.99.51.100",".");
		
				int count = 0 ;
				while(s.hasMoreTokens())
				{
					String n =(String) s.nextToken();
					
					int no = Integer.parseInt(n);
					if(no>=0 && no<=255)
					{
						count++;
					}
				}
				if(count==4)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}
				
				
				
				
				
				
				
				
				
				
		//-------------------------------------------------------------------------
				
				/*int count=0;
				while(s.hasMoreTokens())
				{
					String n = s.nextToken();
					int no=Integer.parseInt(n);
					
					if(no>=0 && no<=255)
					{
						count++;
					}
					
				}
				
				if(count==4)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}
		*/	}

		 
		 
	}


