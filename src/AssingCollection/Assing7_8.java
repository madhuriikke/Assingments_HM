/*An arraylist of Strings is given as input. The count of the String elements that are not of size input2 string is to be returned.
input1: {"aaa","bb","cccc","d"}
input2: "bb"
output: 3("bb"-length:2)
*/

package AssingCollection;

import java.util.Scanner;

public class Assing7_8 {

	public static void main(String[] args) {


		String s[] = {"aaa","bb","cccc","d"};
		String s1 = "bb";			int ans = 0;
		
		for(int i=0;i<s.length;i++)
		{
			if(s1.length()!=s[i].length())
			{
				ans++;
			}
		}System.out.println(ans);
		}
	}


