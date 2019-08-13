 //Retrieve the odd-position digits from input integer array. Multiply them with their index and return their sum.

package Assingment3;

public class Assing3_33 {

	public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5,6,7,8};
		int num =0;
		for(int i =0;i<input.length;i++) {
			if(i%2 !=0) {
				num =num+input.length*1;
				
			}
		}
		System.out.println("Sum Of Odd Index Integer with their index Multiplication is: " + num);

	}

}
