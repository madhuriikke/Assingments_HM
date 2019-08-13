/*Find no of characters in a given string which are not repeated.
input: "hello"
output: 3
*/
public class Assing1_19 {

	public static void main(String[] args) {

		String input = "Madhuri ikke";
		String nonrepeatedchar = "";
		int flag = 0;//temp variable
		int inputlength = input.length();
		char[] chars = new char[inputlength];
		for (int i = 0; i < inputlength; i++) {

			chars[i] = input.charAt(i);
		}

		for (int j = 0; j < inputlength; j++) {

			for (int k = 0; k < inputlength; k++) {

				if (j != k && chars[j] != (' '))

				{
					if (chars[j] == chars[k]) {

						flag = 1;

					}

				}

			}

			if (flag == 0) {
				nonrepeatedchar = nonrepeatedchar + chars[j];

			}

			flag = 0;

		}
		System.out.println("Non repeated characters are :  " + nonrepeatedchar);
		System.out.println("Repeated character count is : " + nonrepeatedchar.length());
	}

}
