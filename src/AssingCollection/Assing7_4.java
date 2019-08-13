/*Two inputs of a string array and a string is received. The array shld be sorted in descending order. The index of second input in a array shld be retrieved.
input1:{"ga","yb","awe"}
input2:awe
output:2*/

package AssingCollection;

import java.util.Arrays;
import java.util.Collections;

public class Assing7_4 {

	public static void main(String[] args) {
		String s[] = { "ga", "yb", "awe" };
		String x = "awe";
		int location = 0;
		Arrays.sort(s, Collections.reverseOrder());

		for (int i = 0; i < s.length; i++) {
			String a = s[i];
			if (x.equals(a)) {
				location = i;
			}

		}
		System.out.println(location);

		/*
		 * String s1=""; TreeSet<String> ts = new TreeSet<String>(); for(int
		 * i=0;i<s.length;i++) { ts.add(s[i]); }
		 * 
		 * for(String d:ts) { s1=d+" "+s1; }
		 * 
		 * 
		 * String j="awe"; int location=0; String a[]=s1.split(" "); for(int
		 * i=0;i<a.length;i++) { if(a[i].equals(j)) { location=i; }
		 * }System.out.println(location);
		 */

	}

}
