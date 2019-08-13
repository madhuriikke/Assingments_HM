/*int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.
*/

package Assingment4;

import java.util.Scanner;

public class Assing4_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of int array: ");
		int input = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int array[] = new int[input];
		for (int i = 0; i < input; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];
		int min = array[0];
		for (int j = 0; j < array.length; j++) {

			if (max < array[j]) {
				max = array[j];
			}
		}

		System.out.println("Max num is: " + max);
		for (int k = 0; k < array.length; k++) {

			if (min > array[k]) {
				max = array[k];
			}
		}

		System.out.println("Min num is: " + min);

		System.out.println("Difference between Min and Max is: " + (max - min));
	}

}
