package Assingment5;

import java.util.TreeSet;

/*18) i/p: Honesty is my best policy abcdefg
o/p: Honesty
Return the maximum word length from the given string.
If there are two words of same length then,
return the word which comes first based on alphabetical order.*/
		
public class Assing5_18 {

	public static void main(String[] args) {
		String s = "Honesty Is My Best Policy ";
//-------------------------------------------------------------------------
		String s1[]=s.split(" ");
		int length=0;
		
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			if(length<s2.length())
			{
				length=s2.length();
			}
		}
		System.out.println(length);
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			String s4 = s1[i];
			if(length==s4.length())
			{
				ts.add(s4);
			}
		}
		for(String s5:ts)
		{
			System.out.println(s5);
			break;
		}

	}

}
