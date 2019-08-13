/*Add elements of digits:9999 
    output:9+9+9+9=3+6=9;
*/

package Assingment6;

import java.util.Arrays;
import java.util.Scanner;

public class Assing6_12 {

	public static void main(String[] args) {

		System.out.println("Enter the number you want");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// System.out.println(ch);
			sum = sum + Character.getNumericValue(ch);

		}
		System.out.println(sum);

	}

}
