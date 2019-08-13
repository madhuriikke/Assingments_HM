package Assingment4;

/*Get all the numbers alone from the string and 
* return the sum*/
public class Assing4_11 {

	public static void main(String[] args) {
		String s = "sushama2345 foram23 darshanaben876";		
		//-------------------------------------------------------------------------
				int ans = 0 ;
				for(int i=0;i<s.length();i++)
				{
					if(Character.isDigit(s.charAt(i)))
					{
						ans = ans + Character.getNumericValue(s.charAt(i));
					}
				}System.out.println(ans);
				
				
				
				
				
				
				
		//-------------------------------------------------------------------------		
				/*int sum=0;		String s1 = "";	
				
				for(int i=0;i<s.length();i++)
				{
					if(Character.isDigit(s.charAt(i)))
					{
						sum = sum + Character.getNumericValue(s.charAt(i));
					}
					else
					{
						s1=s1+s.charAt(i);
					}
					
				}System.out.println(s1);
				System.out.println(sum);
		*/		

	}

}
