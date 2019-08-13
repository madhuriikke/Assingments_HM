//Input a hashmap. Count the keys which are not divisible by 4 and return.

package Assingment3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assing3_36 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(1, "one");
		hs.put(2, "Two");
		hs.put(3, "Three");
		hs.put(4, "Four" );
		hs.put(5, "five");
		hs.put(6, "six");
		hs.put(7, "seven");
		hs.put(8, "eight");
		
		
		//Get a set of the entries
				Set<Entry<Integer,String>> set=hs.entrySet();
				
				// Get an iterator
			    Iterator<Entry<Integer, String>> i = set.iterator();
				
			    // Display elements
			    while(i.hasNext()) {
			         Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)i.next();
			         int key=Integer.parseInt(me.getKey().toString());
			         if(key%4!=0)
			         	System.out.println(me.getValue());
			      }

	}

}
