/*HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
    String[] input2={“speaker”,”mouse”};
    Float output=600.80(500.6+100.2);
*/

package AssingCollection;

import java.util.HashMap;
import java.util.Iterator;

public class Assing7_25 {

	public static void main(String[] args) {
		HashMap<String, String> hp = new HashMap<String, String>();
		hp.put("mouse", "100.2");
		hp.put("speaker", "500.6");
		hp.put("Monitor", "2000.23");
		//System.out.println(hp);

		String[] s = { "speaker", "mouse" };

		float sum = 0;
		Iterator<String> i = hp.keySet().iterator();
		while (i.hasNext()) {
			String s1 = i.next();
			float f = Float.parseFloat(hp.get(s1));
			// System.out.println(f);
			for (int j = 0; j < s.length; j++) {
				
				if (s[j].equals(s1)) {

					sum = sum + f;

				}
			}

		}
		System.out.println(sum);

	}
}
