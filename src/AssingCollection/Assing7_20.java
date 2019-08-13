package AssingCollection;

import java.util.StringTokenizer;

/*input-- String input1="AAA/abb/CCC"
char input2='/'
output-- String[] output1;
output1[]={"aaa","bba","ccc"};

operation-- get the strings from input1  using stringtokenizer
            reverse each string
            then to lower case
            finally store it in output1[] string array*/
public class Assing7_20 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("AAA/abb/CCC", "/");
		int index = 0;
		String n[] = new String[st.countTokens()];

		while (st.hasMoreTokens()) {
			String j = st.nextToken();
			StringBuffer sb = new StringBuffer(j);
			sb.reverse();

			String k = sb.toString().toLowerCase();
			n[index] = k;
			index++;

		}

		for (int i = 0; i < index; i++) {
			System.out.println(n[i]);
		}

	}

}
