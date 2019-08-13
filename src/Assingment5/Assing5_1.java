/*INPUT1= helloworld
   INPUT2= 2. delete the char,if rpted twice.
   if occurs more than twice,leave the first occurence
    and delete the duplicate
   O/P= helwrd;
*/

package Assingment5;

import java.util.Scanner;

public class Assing5_1 {

	StringBuffer sb = new StringBuffer();
	
	public void m1(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=1;j<str.length();j++) {
				if(ch[i]!=ch[j]) {
					System.out.println(ch[i]);
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		System.out.println("Enter the String");

		str = sc.nextLine();
		
		Assing5_1 a=new Assing5_1();
		a.m1(str);
		

	}
}
