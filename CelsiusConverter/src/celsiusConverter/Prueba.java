package celsiusConverter;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Prueba {
	public static void main(String[] args) {
		LocalDate entero = LocalDate.now();
//		entero.withMonth(8);
//		LocalDate.of(2017, Month.APRIL, 21);
		System.out.println(entero);
		System.out.println(entero.withMonth(8));
//		entero.minusYears(2);
		System.out.println(entero.minusYears(2));
//		entero.plusWeeks(2);
		System.out.println(entero.plusWeeks(2));
//		entero.withYear(2014);
		System.out.println(entero.withYear(2014));
		System.out.println(entero.plusDays(20));
		System.out.println(entero.getDayOfWeek());
		System.out.println(entero.of(2020, 2, 2));
		System.out.println(entero.of(2017,6,1).getMonth());
		Period period = Period.ofYears(20);
		System.out.println(period);
	}
}
