/*Enter yout name and return a string "print the title first and then comma and then first letter of initial name.
*/
package Assingment3;
//not done
import java.util.Scanner;

public class Assing3_22 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the your name in the Mr.firstname lastname format: ");
		String name=sc.nextLine();
		
		//String name= "Mr.Rahul Jiwade Patil";
		String[] title=name.split("[.]");
		for (int i=0;i<title.length;i++){
	
		}
		System.out.println(title[0]+",");
		
		String fullname=title[1];
		String[] initialletter=fullname.split(" ");
		
		for (int j=0;j<initialletter.length-1;j++){
			
			System.out.print(initialletter[j].charAt(0)+" ");
		}
		System.out.println(initialletter[2]);
		


	}

}
