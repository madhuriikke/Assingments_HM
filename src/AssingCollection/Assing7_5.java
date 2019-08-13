
/*Retrieve the palindorme-true number set from given number limit and return the sum
input1:90 input2:120
logic:99+101+111
output:311*/

package AssingCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assing7_5 {

	public static void main(String[] args) {
        ArrayList <Integer> ar =new ArrayList <Integer>();
		int sum = 0;
		for (int i = 90; i <= 120; i++) 
		{
			String s = Integer.toString(i);
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String reverse = sb.toString();
			int no = Integer.parseInt(reverse);
			if (reverse.equals(s)) 
			{
				
				ar.add(no);
			}

		}
		
		Iterator<Integer> i = ar.iterator();
		while(i.hasNext())
		{
			sum = sum +i.next();
		}
		
		System.out.println(sum);
		
		


	}
}









