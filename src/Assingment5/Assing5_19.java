package Assingment5;

public class Assing5_19 {
	/*In a string check whether all the vowels are present
	if yes return 1 else 2.
	ex: String 1="education"
	    output=1.*/
	    
	public static void main(String[] args) {
		
		String str="education";
		int a=0,e=0,i=0,o=0,u=0;
		for(int j=0;j<str.length();j++)
		{
			char c = str.charAt(j);
			
			if((c=='a')|| (c=='A'))
			{
				a++;
			}
			else if((c=='e')||(c=='E'))
			{
				e++;
			}
			else if((c=='i')||(c=='I'))
			{
				i++;
			}
			else if((c=='o')||(c=='O'))
			{
				o++;
			}
			else if((c=='u')||(c=='U'))
			{
				u++;
			}
		}
		
		if((a!=0)&&(e!=0)&&(i!=0)&&(o!=0)&&(u!=0))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
		
	}

}
