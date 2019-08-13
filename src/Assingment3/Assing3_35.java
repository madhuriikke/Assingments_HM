//Retrieve the elements in a array, which is an input, which are greater than a specific input number. Add them and find the reverse of the sum.


//update




package Assingment3;

import java.util.Scanner;

public class Assing3_35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int number = sc.nextInt();
		System.out.println("Enter the Element " + number + " of an Array: ");

		int[] numbers = new int[number];

		for (int i = 0; i < numbers.length; i++) {

			System.out.print("Please enter number: ");

			numbers[i] = sc.nextInt();
			

			System.out.println("Enter the input number: ");
			int num = sc.nextInt();

			int sum = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] > num) {
					sum = sum + numbers[i];

				}
			}
			System.out.println("Sum of numbers which is greater than given num is: "+sum);
	       
			String s= Integer.toString(sum);
			String rev="";
			char[] ch=s.toCharArray();
			for(int j=s.length()-1;j>=0;j--){
				rev=rev+s.charAt(j);
			}
			System.out.println("Reverse of the output sum is: "+rev);

		}

	}

}
