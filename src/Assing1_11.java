import java.util.ArrayList;
import java.util.TreeSet;

/*11. Two input strings are accepted. If the two strings are of same length concat them and return, if they are not of same length, reduce the longer string to size of smaller one, and concat them
input1:"hello"
input2:"hi" 
output:"lohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"
*/
public class Assing1_11 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("hi");
		al.add("lohi");
		al.add("aaa");
		al.add("bbb");

		System.out.println(al);
		TreeSet<String> set = new TreeSet<String>(al);//seqance 
		System.out.println(set);

		for (String s1 : al) {
			StringBuffer sb = new StringBuffer(s1);
			sb.reverse();
			String s = sb.toString();
			if (s1.equals(s)) {
				System.out.print(s1 + "\t");
			}

		}

	}
}
