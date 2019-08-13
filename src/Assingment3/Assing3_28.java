/*String encrption. replace the odd-index character with next character(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.*/

package Assingment3;

//not done
public class Assing3_28 {

	public static void main(String[] args) {

		String s = "Madhuriz";

		String n = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				if (s.charAt(i) == 'z') {
					n = n + "a";
				} else {
					int no = ((int) s.charAt(i)) + 1;
					char c = (char) no;
					n = n + c;
				}

			} else {
				n = n + s.charAt(i);
			}
		}
		System.out.println(n);

	}
}

//-------------------------------------------------------------------------		
/*
 * String s1 = ""; for(int i=0;i<s.length();i++) { if(i%2==0) { s1 = s1 +
 * s.charAt(i); } else { int no = (int) s.charAt(i);
 * 
 * int no1 = no + 1; char c = (char) no1; s1 = s1 + c; }
 * }System.out.println(s1);
 */
/*
 * //c= (char) s.codePointAt(i);
 * 
 * char c = s.charAt(1); int no = (int) c;
 * 
 * 
 * int no1=no+1; char c1 = (char) no1;
 * 
 * //c1=(char) s.codePointAt(i+1); System.out.println(s.replace(c,c1));
 */

/*
 * char c; char c1; for(int i=1;i<s.length();i+=2) { c= (char) s.codePointAt(i);
 * c1=(char) s.codePointAt(i+1); System.out.println(s.replace(c,c1)); }
 * 
 * }
 */