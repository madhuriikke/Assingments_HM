/*Given two integer arrays. merge the common elements into a new array. find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7*/

package AssingCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Assing7_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int num1 = sc.nextInt();
		int[] array1 = new int[num1];
		System.out.println("Enter the array elements in the first array: ");
		for (int i = 0; i < num1; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array: ");
		int num2 = sc.nextInt();
		int[] array2 = new int[num2];

		System.out.println("Enter the array elements in the second array: ");
		for (int j = 0; j < num2; j++) {
			array2[j] = sc.nextInt();
		}

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == (array2[j])) {
					set.add(array1[i]);
				}
			}
		}

		System.out.println("Common Elements between two array is: " + set);

		int sum = 0;
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			sum = sum + itr.next();

		}
		System.out.println("sum of the common elements between two array is : " + sum);

	}

}
