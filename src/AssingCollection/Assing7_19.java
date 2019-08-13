/*Collect no’s frm list1 which is not present in list2 
    & Collect no’s frm list2 which is not present in list1
    and store it in output1[].
    ex: input1={1,2,3,4}; 
    input2={1,2,3,5}; 
    output1={4,5};*/

package AssingCollection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assing7_19 {

	public static void main(String[] args) {
		List<Integer>al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		List<Integer>al1=new ArrayList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(5);
		
		System.out.println(al);
		System.out.println(al1);
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i)!=al1.get(i)) {
				System.out.println(al.get(i));
				System.out.println(al1.get(i));
			}
		} 
		

	}
}

