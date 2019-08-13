package AssingCollection;

import java.util.HashMap;
import java.util.Map;

/*HashMap<String,Integer> h1={“abc”:50,”efg”:70};
if the mark is less than 60 then put the output in the
HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}*/
public class Assing7_22 {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("abc",51);
		//hm.put("efg",70);
		HashMap<String,String> n = new HashMap<String,String>();
		
		for(Map.Entry<String,Integer> me : hm.entrySet())
		{
			String h = me.getKey();
			int no = me.getValue();
			
			if(no>50)
			{
				n.put(h,"Pass");
			}
			else
			{
				n.put(h,"Fail");
			}
		}
		
		for(Map.Entry<String,String> k : n.entrySet())
		{
			System.out.println(k.getKey()+"\t"+k.getValue());
		}
			
		
		

	}

}
