package Assingment5;

/*Return 1 if the last & first characters of a string are equal else 
    return -1. Consider case.
    Eg: Input = "this was great"
        Output= 1

*/
public class Assing5_16 {

	public static void main(String[] args) {

		String str = "this was great dayt";
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}

	}
}
