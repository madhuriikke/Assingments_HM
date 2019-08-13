package Assingment3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Assing3_39 {

	public static void main(String[] args) {
		LocalDate d1 =LocalDate.of(2018, 10, 5);
		LocalDate d2 =LocalDate.of(2019, 10, 4);
		System.out.println(ChronoUnit.MONTHS.between(d1, d2));
		
	}

}
 