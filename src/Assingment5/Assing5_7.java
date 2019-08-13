package Assingment5;

/*Input1=”cowboy”; Output1=”cowcow”;
Input1=”so”;output1=”sososo”; 
HINT: if they give 3 letter word u have to display 2 time;
*/
public class Assing5_7 {


	public static void main(String[] args) {
		
		String s = "cowboy";		int count=0; 		
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			
			count++;
			
			if(count==4)
			{
				break;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
			
		}
		String s2="";
		if(s1.length()==3)
		{
			for(int i=1;i<=2;i++)
			{
				s2=s2+s1;
			}
		}
		System.out.println(s2);
	}

}

		/*
		 * if(s.length()==2) { for(int i=1;i<=3;i++) { s1=s1+s; }
		 * }System.out.println(s1);
		 */
		
