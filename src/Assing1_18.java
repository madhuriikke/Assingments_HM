/*Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
*/

import java.util.Scanner;

public class Assing1_18 {

	static char ch;
	static int vowels = 0;
	static boolean pali = true;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");

		String name = sc.nextLine();
		System.out.println("You have enter the string : " + name);

		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		}
		System.out.println("Reverse of the given String is: " + reverse);

		if (name.equals(reverse)) {//mom=mom:true
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not Palindrome");
		}

		for (int j = 0; j < name.length(); j++) {
			ch = name.charAt(j);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U')
				vowels++;

		}
		System.out.println("Total number of vowels in the string is: " +vowels);

	}

}
