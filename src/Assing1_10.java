/*Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c

*/

import java.util.Scanner;

public class Assing1_10 {

	public static String revString(String s1) {
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		StringBuffer sb1 = new StringBuffer();//new string store for output 
		for (int i = 0; i < (2 * s1.length()) - 1; i++)
			//System.out.println((2 * s1.length()));
			if (i % 2 != 0)
				sb1 = sb.insert(i, '-');
		return sb1.toString();//convert into string 

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = s.next();
		System.out.println("The formated string is:" + revString(s1));

	}

}