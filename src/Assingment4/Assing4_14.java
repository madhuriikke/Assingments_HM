/*for the given string display the middle 2 value, case satisfies only if string is of even length
ip - java
op - av*/

package Assingment4;

import java.util.Scanner;

public class Assing4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str1 = sc.nextLine();

		if (str1.length() % 2 == 0) {
			System.out.println(str1.substring(1, str1.length() - 1));
		} else {
			System.out.println("lenght is not even");
		}

	}

}
