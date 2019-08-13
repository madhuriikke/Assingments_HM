package Assingment6;

/*find the maximum chunk of a given string
i/p: this isssss soooo good
o/p=5*/
//notdone
public class Assing6_2 {

	public static void main(String[] args) {
		String str = "this isssss soooo good";

		int count = 0, ans = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				count = 0;
			}

			if (ans < count) {
				ans = count;
				// System.out.println(ans);
			}
		}
		System.out.println(ans + 1);

	}
}
