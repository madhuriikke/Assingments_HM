/*input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string
*/
 


package Assingment3;
//using count+ using comments with all logical lines
import java.util.Scanner;

public class Assing3_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strring");
		String input= sc.next();
		
		int count =1;
		for(char ch: input.toCharArray()) {
			
			if( (ch=='a'|| ch=='A' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u' ))
			{
			}
			else
			
				System.out.println(ch);
			
			count++;
			
			}
		
		

	}

}
