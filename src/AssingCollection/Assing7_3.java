/*arraylist of string type which has name#mark1#mark2#mark3 format.
 *  retrieve the name of the student who has scored max 
 *  marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak*/

package AssingCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Assing7_3 {

	public static void main(String[] args) {
		int total = 0;
		int max = 0;
		String name = null;
		ArrayList<String> al = new ArrayList<String>();
		al.add("arun#12#12#12");
		al.add("deepak#13#12#12");
		al.add("mad#16#12#12");
		al.add("saba#78#12#12");
		
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {

			String[] s = it.next().split("#");
			total = Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3]);
			// System.out.println(total);
			if (max < total) {
				max = total;
				name = s[0];

			}
		}
		System.out.println("max marks student is " + name + " " + max);
	}

}
