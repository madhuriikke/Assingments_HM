//dateFind the number of days between two input s.

package Assingment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assing3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start date in dd-MM-yyyy");
		String s1 = sc.next();
		System.out.println("Enter end date in dd-MM-yyyy");
		String s2 = sc.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {

			Date startdate = sdf.parse(s1);
			Date enddate = sdf.parse(s2);
			long diffInMilliSec = enddate.getTime() - startdate.getTime();
			long years = (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
			long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;
			
			System.out.println("Number of days between two dates is : "+days+"days, years is:"+years);
		}
		catch(ParseException e){
			e.printStackTrace();
			
		}


	}

}
