
/*getting the first and last n letters from a word where wordlength > 2n.
    Ex: Input: california,3.
        output: calnia.
*/

package Assingment6;

import java.util.Scanner;

public class Assing6_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input1 = sc.nextLine();
		System.out.println("How many first and last char of string you want");
		int input2 = sc.nextInt();

		if (input1.length() > (2 * input2)) {
			String sub1 = input1.substring(0, input2);
			String sub2 = input1.substring(input1.length() - input2, input1.length());
			System.out.println(sub1 + sub2);

		} else {
			System.out.println("Given string is short of length");
		}

	}

}
