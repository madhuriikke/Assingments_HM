package AssingCollection;

import java.util.HashMap;
import java.util.Map;

/*I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
i/p 2="hari";
o/p string[]={"ram","cts"};*/

public class Assing7_15 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("ram", "hari");
		hm.put("cisco", "barfi");
		hm.put("honeywell", "cs");
		hm.put("cts", "hari");

		String j = "hari";
		int index = 0;
		String ans[] = new String[hm.size()];
		for (Map.Entry<String, String> me : hm.entrySet()) {
			String n = me.getValue();
			String n1 = me.getKey();

			if (j.equals(n)) {
				ans[index] = n1;
				index++;
			}
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.println(ans[i]);
		}

		/*
		 * 
		 * String n = "hari"; String array[]=new String[hm.size()]; int index=0;
		 * 
		 * for(Map.Entry<String,String> me : hm.entrySet()) { String key = me.getKey();
		 * String value = me.getValue();
		 * 
		 * if(n.equals(value)) { array[index] = key; index++; } } for(int
		 * i=0;i<index;i++) { System.out.println(array[i]); }
		 */

		/*
		 * String s[]=new String[hm.size()]; int index=0;
		 * 
		 * for(Map.Entry me : hm.entrySet()) { String j = (String) me.getValue();
		 * if(n.equals(j)) { s[index] = (String) me.getKey(); index++; }
		 * 
		 * } for(int i=0;i<index;i++) { System.out.println(s[i]); }
		 */ }

}
