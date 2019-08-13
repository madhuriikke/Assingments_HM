
/*input1={2,4,3,5,6}; if odd find square if even find cube finally add it
output1=208(4+16+27+125+36)
*/

package Assingment6;

public class Assing6_4 {

	public static void main(String[] args) {

		int input[] = { 2, 4, 3, 5, 6 };
		int sum = 0;
		for (int i : input) {
			if (i % 2 != 0) {
				sum += (i * i * i);
			} else {
				sum += (i * i);

			}
		}
		System.out.println(sum);
	}

}
