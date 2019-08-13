/*HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90
*/

package AssingCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Assing7_6 {

	public static void main(String[] args) {
       HashMap <Integer ,Double> hs =new HashMap <Integer ,Double>();
        hs.put(12, (double) 90);
        hs.put(35, (double) 90);
		hs.put(33, (double) 90);
		hs.put(56, (double) 90);
		hs.put(51, (double) 58);
       
		
		System.out.println("Size of the map is: " + hs.size());
		double sum =0;
		int cnt =0;
		for(Entry<Integer, Double> e : hs.entrySet()) {
			
				Integer key = e.getKey();
				Double value = e.getValue();
				if (key % 2 != 0) {
					sum = sum + value;
					cnt++;
				}

			}
			System.out.println("Avg of odd number key value is: "+sum / cnt);
 
		}
	}


