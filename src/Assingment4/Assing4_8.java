/*count the number of times the second word in second string occurs in first string-case sensitive

input1=hai hello hai where hai Hai;
input2=what hai
output=3;*/

package Assingment4;

import java.util.Scanner;

public class Assing4_8 {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String input1 = sc.nextLine();

		String[] split1 = input1.split(" ");

		System.out.println("Enter the second String");
		String input2 = sc.nextLine();

		String[] split2 = input2.split(" ");

		int count = 0;

		for (String s1 : split1) {
			for (String s2 : split2) {
				if (s1.equals(s2)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
