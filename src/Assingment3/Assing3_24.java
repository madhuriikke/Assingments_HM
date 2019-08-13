/*validate a password 
i) there should be atleast one digit
ii) there should be atleast one of '#','@' or '$' .
iii)the password should be of 6 to 20 characters
iv) there should be more uppercase letter than lower case.
v) should start with an upper case and end with lower case*/


//not done
package Assingment3;

import java.util.Scanner;

public class Assing3_24 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the password");
		String password =sc.next();
		

		String regexp = "^[A-Z](?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$]).{6,20}[a-z]$";

		if (password.matches(regexp)) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is not valid");
		}

	}

}
