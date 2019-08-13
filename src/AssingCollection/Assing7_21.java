package AssingCollection;

import java.util.ArrayList;
import java.util.List;

/*input1-List1-{apple,orange,grapes}
input2-List2-{melon,apple,mango}
output={mango,orange}
operation-- In 1st list remove strings starting with 'a' or 'g'
            In 2nd list remove strings ending with 'n' or 'e'
Ignore case, return in string array*/
public class Assing7_21 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("apple");
		l.add("orange");
		l.add("grapes");
		
		List<String> al=new ArrayList<>();
		al.add("mango");
		al.add("apple");
		al.add("melon");

		String n[] = new String[l.size()+al.size()];
		int index= 0 ;
		
		for(int i=0;i<l.size();i++)
		{
			String x = l.get(i).toString();
			
			char c = x.charAt(0);
			
			if(((c!='a') && (c!='A')) && ((c!='g') && (c!='G')))
			{
				n[index] = x;
				index++;
			}
		}
		
		
		for(int i=0;i<al.size();i++)
		{
			String x = al.get(i).toString();
			
			char c = x.charAt(x.length()-1);
			
			if(((c!='n') && (c!='N')) && ((c!='E') && (c!='e')))
			{
				n[index] = x;
				index++;
			}
		}
		
		for(int i=0;i<index;i++)
		{
			System.out.println(n[i]);
	}

}
}