/*Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2
*/

package Assingment4;

public class Assing4_17 {

	public static void main(String[] args) {
		
		String[] input = {"2AA","12","ABC","c1a"};
		String str ;
		String digit = "";
	    int sum= 0;
		
		for(int i =0;i<input.length-1;i++) {
		str =input[i];
		for(int j =0;j<str.length()-1;j++)
		 
		if(Character.isDigit(str.charAt(i))) {
			digit =digit + str.charAt(i);
			//System.out.println(digit);
		
		if(!digit.equals(""))
				{
			sum=sum+Integer.parseInt(digit);
			digit="";
				}
			
		}
		
		}System.out.println("sum is "+sum);
		
	}

}
