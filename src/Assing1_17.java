/*Input a int array. Square the elements in even position and cube the elements in odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2*/

public class Assing1_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 4};
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			//System.out.println(i);
			if (array[i] % 2 == 0)
				sum += array[i] * array[i];

			else
				sum += array[i] * array[i] * array[i];

		}
		System.out.println("Addition of all the square and cube is: " + sum);

	}

}
