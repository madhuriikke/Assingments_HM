/*Getting the first and last n letters from a word where wordlength > 2n.
    Ex: Input: california,3.
        output: calnia*/

package Assingment6;

public class Assing6_010 {

	public static void main(String[] args) {
		 
	String str = "california";
	 
	if(str.length()>2) {
		
		String Ans=str.substring(0,3);
		//System.out.println(Ans);
		System.out.println(Ans+str.substring(str.length()-3));
		
	}
	
	

	}

}
