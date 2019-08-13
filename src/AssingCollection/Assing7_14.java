package AssingCollection;

import java.util.HashMap;
import java.util.Map;

/*Create a program to get the hashmap from the given input string array where the key for the hashmap
   is first three letters of array element in uppercase and the value of hashmap is the element itself
   Input:{“goa”,”kerala”,”gujarat”}                 [string array]
   Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]
*/

public class Assing7_14 {

	public static void main(String[] args) {
		String a[] = {"goa","kerala","gujarat"};

		HashMap<String,String> hm = new HashMap<String,String>();
		//Hashmap= value,it is not thred set,warking as faster,pair key and value,one null value is Allowed,dublicate is not allowed

		//hashset=its set interface,insertion order is not presved,its serialsble,cloneble(dublicate copy creatable)
		for(int i=0;i<a.length;i++)
		{
			String y = "";
			String x = a[i];
			y = y+x.charAt(0) + x.charAt(1)+x.charAt(2);
			String x1 = y.toUpperCase(); 
			hm.put(x1,x);
		}
		
		for(Map.Entry<String,String> me : hm.entrySet())
		{
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
	}

}
