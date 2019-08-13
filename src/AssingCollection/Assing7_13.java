package AssingCollection;

import java.util.Arrays;
import java.util.Collections;

public class Assing7_13 {
	/*
	 * input array={red,green,blue,ivory} sort the given array reverse the given
	 * array if user input is 1 it should give oth element of an reversed array.
	 */
	public static void main(String[] args) {
		

		
		String s[]={"red","green","blue","ivory"};
		Arrays.sort(s);
		Arrays.sort(s,Collections.reverseOrder());
		
		String s1[] = new String[s.length];			int index = 0 ;
		for(int i=0;i<s.length;i++)
		{
			s1[index] = s[i];
			index++;
		}
		int no = 1;
		System.out.println(s[no-1]);

	}

}
