/*A integer input is accepted. find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5
*/

package AssingCollection;

import java.util.Scanner;

public class Assing7_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int number: ");
		String number = String.valueOf(sc.nextLine());

		int sum = 0;
		for (char ch : number.toCharArray()) {
			int num = Integer.parseInt(String.valueOf(ch));
			sum = sum + num * num;

		}
		System.out.println("Sum of square of digits of the given number is: " + sum);
	}
}