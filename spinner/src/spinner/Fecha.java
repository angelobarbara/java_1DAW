package spinner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Fecha {
	static DayOfWeek getDiaDeLaSemanaFechaPasada(LocalDate localDate) throws FechaNoValidaException {
		if (esFechaFutura(localDate))
			throw new FechaNoValidaException("Introduzca una fecha válida");
		return localDate.getDayOfWeek();
	}

	private static boolean esFechaFutura(LocalDate localDate) {
		return localDate.isAfter(LocalDate.now());
	}

	public static String cuentaAtrasCumpleannos(LocalDate fechaDeNacimiento) {
		LocalDate hoy = LocalDate.now();
		LocalDate cumpleannosActual = fechaDeNacimiento.withYear(hoy.getYear());
		if (cumpleannosActual.isBefore(hoy) || cumpleannosActual.isEqual(hoy)) {
			cumpleannosActual = cumpleannosActual.plusYears(1);
		}
		Period p = Period.between(hoy, cumpleannosActual);
		long dias = ChronoUnit.DAYS.between(hoy, cumpleannosActual);
		return "Quedan " + p.getMonths() + " meses y " + p.getDays() + " días para tu próximo cumpleaño (" + dias
				+ " dias en total)";
	}
}
