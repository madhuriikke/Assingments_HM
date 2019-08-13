package AssingCollection;

import java.util.HashMap;
import java.util.Map;

/*In a hashmap if key is odd then find average of value as integer
ex: h1={1:4,2:6,4:7,5:9}
    output=(4+9)/2*/
public class Assing7_23 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 4);
		hm.put(2, 6);
		hm.put(4, 7);
		hm.put(5, 9);
		
		int ans = 0, count = 0;
		
		for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
			int key = me.getKey();
			int value = me.getValue();

			if (key % 2 != 0) {
				ans = ans + value;
				count++;
			}
		}
		System.out.println((ans / count));

	}

}
