
/*Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
	if both the sum is equal return 1 or return -1.
*/

package Assingment4;

import java.util.Scanner;

public class Assing4_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter array element");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int evensum = 0;
		int oddsum = 0;
		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) {
				evensum = evensum + array[j];
			} else {
				oddsum = oddsum + array[j];
			}
		}
		System.out.println("Even index elements sum is: " + evensum);
		System.out.println("Odd index elements sum is: " + oddsum);
		if (evensum == oddsum) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}
	}
}
