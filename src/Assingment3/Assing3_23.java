//Write a Program that accepts a string and removes the duplicate characters




package Assingment3;

public class Assing3_23 {

	public static void main(String[] args) {
		
		String input = "Heelloo";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			boolean check = false;

			for (int j = 0; j < output.length(); j++) {
				if (output.charAt(j) == input.charAt(i)) {
					check = true;
					break;
				}
			}
			if (!check) {
				output = output + input.charAt(i);
			}
		}
	
	
	System.out.println("New String is as follows:  "+ output);
	
	}

}
