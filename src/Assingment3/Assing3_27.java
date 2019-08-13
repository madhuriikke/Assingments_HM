/*find the three consecutive characters in a string. if the string consists any three 
   consecutive characters return 1 else return -1
   like AAAxyzaaa will return true.
*/

package Assingment3;

public class Assing3_27 {

	public static void main(String[] args) {

		String s = "AAxAyzaa";
		int count = 0 ;
		for(int i=0;i<s.length()-2;i++)
		{
			
			if((s.charAt(i)==s.charAt(i+1)) && (s.charAt(i)==s.charAt(i+2)))
	 		{
				count++;
				if(count>=1)
				{
					System.out.println("1");
				}break;
			}
		}	
			
			if(count==0)
			{
				System.out.println("-1");
			}
		
		
	}
}
		
		
		
		
		
		
		
		/*
		int count = 0,result=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==3)
			{
				result ++;
				count = 0;
			}
			else
			{
				count = 0;
			}
		}
		if(result>0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
*/