/*input1="Rajasthan";
input2=2;
input3=5;
output=hts;
*/

package Assingment3;

public class Assing3_31 {

	public static void main(String[] args) {

		String s = "Rajasthan";
//-------------------------------------------------------------------------
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String n = sb.toString();
		System.out.println(n.substring(2, 5));

//-------------------------------------------------------------------------		
		/*OTHER WAY
		 * StringBuffer sb = new StringBuffer(s); sb.reverse(); String s1 =
		 * sb.toString(); System.out.println(s1.substring(2,5));
		 */

	}

}
