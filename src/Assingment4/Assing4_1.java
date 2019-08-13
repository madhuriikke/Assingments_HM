/*input1="abc2012345"
	input2="abc2112660"
	input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input3
*/

package Assingment4;

import java.util.Scanner;

public class Assing4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String input1 = sc.nextLine();

		System.out.println("Enter second string: ");
		String input2 = sc.nextLine();

		String sub1 = input1.substring(5, input1.length());
		String sub2 = input2.substring(5, input2.length());

		int output1 = Integer.parseInt(sub1);
		int output2 = Integer.parseInt(sub2);

		System.out.println("Enter third input: ");
		int input3 = sc.nextInt();

		int output = (output2 - output1) * input3;
		System.out.println("Output is: " + output);

	}

}
