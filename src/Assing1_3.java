/*3.A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap.
input: {2,3,4,2,3}
logic: 2-3=1,3-4=1,4-2=2,2-3=1
2 is the max diff between 4 and 2,return the index of 4 i.e 2
output:2*/

public class Assing1_3 {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 2, 3 };
		int maxIndex = 0, maxDiff = 0, min = a[0];
		int maxdiff = a[1] - a[0];

		for (int i = 0; i < a.length; i++) {
			if (maxdiff < a[i] - min) {
				maxdiff = a[i] - min;

			}

		}
		System.out.println("max diffrence is:" + maxdiff);
		// System.out.println(min);

	}

}
