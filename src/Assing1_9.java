/*find the max length-word in a given string and return the max-length word. if two words are of same length return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5)
*/

//update logic
public class Assing1_9 {

	public static void main(String args[]) {
		String str = "I am an intern at geeksforgeeks";
		String[] str1 = str.split(" ");
		int len = 0;
		int maxword = 0;

		for (int i = 0; i < str1.length; i++) {

			if ((str1[i].length() > len)) {
				maxword = i;
				len = str1[i].length();

			}

		}
		System.out.println("word with maximum length is: " + str1[maxword] + "and world length is :"
				+ str1[maxword].length());
	}

}
