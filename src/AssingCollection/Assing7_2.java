/*Retrieve the odd numbers till given input number. 
 *add and subtract it consecutively and return the result.
Input:9
Output:1+3-5+7-9=-3*/

package AssingCollection;

public class Assing7_2 {

	public static void main(String[] args) {

		int no = 9;
		int n[] = new int[no];
		int j = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				n[j] = i;
				j++;
			}
		}

		int a = n[0];
		for (int i = 1; i < n.length; i++) {
			if (i % 2 != 0) {
				a = a + n[i];
			} else {
				a = a - n[i];
			}
		}
		System.out.println(a);

	}

}
