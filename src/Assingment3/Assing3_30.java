/*GIVEN A STRING 555-666-1234
DISPLAY AS 55-56-661-234?
*/
//by logic
package Assingment3;

public class Assing3_30 {

	public static void main(String[] args) {
		
		
		String input="555-666-1234";
		String[] b=input.split("-");
		String split1=b[0];
		String split2=b[1];
		String split3=b[2];
		System.out.println(input);
		String d=split1+split2+split3;
		System.out.println("Given string is:" +d);
		
		StringBuilder str= new StringBuilder(d);
		str.insert(2, "-");
		str.insert(5, "-");
		str.insert(9, "-");
		str.insert(13, "?");
		System.out.println("Expected output is: "+str.toString());

	}

}
