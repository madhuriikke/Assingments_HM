/*compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+*/

//Update logic

package Assingment3;

public class Assing3_37 {

	public static void main(String[] args) {
		String input = "Ner york";
		char [] ch  =input.toUpperCase().toCharArray();
		String input1 = "NWYR";
		char [] ch1 =input1.toUpperCase().toCharArray();
		String output = " ";
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch1.length;j++) {
				if(ch[i] == ch1[j]) {
					output =output + String.valueOf(ch[i]+"+");
					
				}
				
			}
		}
		System.out.println(output);
		
	}
	
}
