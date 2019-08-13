package AssingCollection;
/*input1 is a map<Integer,Float>
{1:2.3,2:5.6,3:7.7,4:8.4}
get the even number from keys and find the avg of values of these keys.
answer should be rounded to two numbers after decimal
eg:- the output number 15.2499999 should be 15.25*/

import java.util.HashMap;
import java.util.Map;

public class Assing7_24 {
//not done
	public static void main(String[] args) {
		HashMap<Integer,Float> hm = new  HashMap<Integer,Float>();
		hm.put(1,2.3f);
		hm.put(2,5.8f);
		hm.put(3,7.7f);
		hm.put(4,8.9f);
		float ans = 0 ;int count = 0 ;
		for(Map.Entry<Integer,Float> me : hm.entrySet())
		{
			int key = me.getKey();
			float value = me.getValue();
			
			if(key%2==0)
			{
				ans = ans + value;
				count++;
			}
		}float avg = ans/count;
		System.out.println(Math.round(avg));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
