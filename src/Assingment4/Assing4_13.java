/*Take the word with a max length in the given sentance
 in that check for vowels if so count the no.of occurances !
  Input 1="Bhavane is a good girl"
  Output =3
  Input 1="Bhavanee is a good girl"
  Output =4*/

package Assingment4;

import java.util.Scanner;

public class Assing4_13 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String input =sc.nextLine();
        
        String split[] =input.split(" ");
        String maxword =split[0];
       // System.out.println(maxword);
        for(int i=0;i<split.length;i++) {
        	if(maxword.length()<split[i].length()) {
        		maxword=split[i];
        }
	}
        System.out.println("max lenght in the given String: " +maxword);
     
       int  count=0;
        for(int j=0;j<maxword.length();j++) {
        char ch= maxword.charAt(j);
        if(ch== 'a' || ch=='e'|| ch=='i'||ch=='o'|| ch=='u') {
        	count++;
        }
        }
        System.out.println("Total no's of vowel in the maxword: "+count);
}
}