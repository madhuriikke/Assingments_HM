package Assingment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//What will be the DAY of current date in next year
public class Assing4_10 {

	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = (c.get(Calendar.MONTH))+1;
		int year = c.get(Calendar.YEAR)+1;
		
		String n = day+"/"+month+"/"+year;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(n);
		System.out.println(sdf.format(d));
		
		sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(d));
				
		
		

	}

}
