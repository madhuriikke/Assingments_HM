/*input:
Searchstring s1="GeniusRajkumarDev";
String s2="Raj";
String s3="Dev";
  output:
       Return 1 if s2 comes before s3 in searchstring else return 2
*/




package Assingment3;

import java.util.Scanner;

public class Assing3_38 {

	public int compString() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the main String:");
		String input1 =sc.next();
		System.out.println("Enter the frist String");
		String input2 =sc.next();
		System.out.println("Enter the secand String ");
		String input3 =sc.next();
		
		if(input1.contains(input2)&&input1.contains(input3)) {
			if(input1.indexOf(input1)<input1.indexOf(input3)){
				return 1;
			}
		}
				return 2;
			}
			
		public static void main(String[] args) {
		
		Assing3_38 as = new Assing3_38();
		System.out.println(as.compString());
		
		
		}
	

	}

