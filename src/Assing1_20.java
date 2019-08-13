import java.util.Scanner;

/*Get a input string. Find if it is a negative number, if true return the absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1*/
public class Assing1_20 {
	public int absoluteValue() {

		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the String number");
			String s = sc.nextLine();
			try {
				int num2 = Integer.parseInt(s);
				if (num2 < 0) {
					int number = -num2;
					return number;
				}

			} catch (NumberFormatException e) {
				System.out.println("");
			}
			return -1;
		}

	}

	public static void main(String[] args) {
		Assing1_20 cn = new Assing1_20();
		System.out.println(cn.absoluteValue());

	}

}
