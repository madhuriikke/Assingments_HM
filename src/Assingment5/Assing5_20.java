package Assingment5;

public class Assing5_20 {
	/*
	 * swap the every 2 chrecters in the given string If size is odd number then
	 * keep the last letter as it is. Ex:- input: forget output: ofgrte Ex:- input :
	 * NewYork output : eNYwrok
	 */

	public static void main(String[] args) {
		String s = "NewYork";
		// String m = "";
		String s2 = "";

		if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length(); i = i + 2) {
				s2 = s2 + s.charAt(i + 1);
				s2 = s2 + s.charAt(i);
			}
		} else {
			char c = s.charAt(s.length() - 1);
			for (int i = 0; i < s.length() - 1; i = i + 2) {
				s2 = s2 + s.charAt(i + 1);
				s2 = s2 + s.charAt(i);
			}
			s2 = s2 + c;
		}
		System.out.println(s2);

	}

}
