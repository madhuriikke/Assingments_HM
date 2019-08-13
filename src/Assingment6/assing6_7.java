/*ip: "this is sample test case"
    op: "this amplec"
    remove the duplicates in the given string
*/

package Assingment6;

import java.util.Scanner;

public class assing6_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();

		char[] ch = input.toCharArray();
		String output = " ";

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					output = output + ch[j];
				}
			}
		}
		System.out.println(output);
	}

}
