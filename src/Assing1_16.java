/*Find if a given pattern appears in both the input strings at same postions.
input1: "hh-ww--"
input2: "rt--er--"
output: true(false otherwise)
*/
//not done ..
public class Assing1_16 {



	public static void main(String[] args) {

		String s1 = "dfs--as--a--";
		String s2 = "aes--gh--e--";
		boolean comp = true;
		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			if (ch1 != '-') {
				if (ch2 == '-') {
					comp = false;
					break;
				}
			} else {
				if (ch2 != '-') {
					comp = false;
					break;
				}
			}

		}

		System.out.println(comp ? "True" : "False");
		}

	}
