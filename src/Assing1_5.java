import java.util.Scanner;

/*Sum of fibonaaci series upto given input.
sum of first 3 
logic:1+1+2
output:4*/
//update logic
public class Assing1_5 {

	public static void main(String args[]) {
		
			int sum = 0, first = 1, second = 1, third = 0, n = 3;

			for (int i = 1; i < n; i++) {
				third = first + second;

				sum =sum+ third;
				first = second;
				third = second;
			}
			System.out.println("Sum of first " + n + " element of fibonacci series is: " + sum);


	}

}
