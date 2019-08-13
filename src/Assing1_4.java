/*Given two arrayslist. retrieve the odd position elements form first input and even position elemetns from second list. 
put it into the new arraylist at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3}*/


public class Assing1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[4];
		arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[4];
		arr2 = new int[] {5,6,7,8};
		
		//without using if condition
		for (int i = 1; i <= 4; i++) {
			if ((i % 2) != 0) {

				System.out.print(" " + arr2[i - 1]);

			} else {

				System.out.print(" " + arr1[i - 1]);
			}


	}

	}
}

