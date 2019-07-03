package consola;

import hospital.Cama;
import hospital.CamaNoExisteException;
import hospital.Hospital;
import hospital.NombreNoValidoException;
import hospital.PacienteNoExisteException;
import hospital.PacienteYaExisteException;
import hospital.Sexo;
import hospital.SexoNoValidoException;
import utiles.Menu;
import utiles.Teclado;

public class TestHospital {
	private static Hospital hospital = new Hospital();

	static Menu menuHospital = new Menu("Examen Marzo Angelo Barbara", new String[] { "Alta paciente", "Baja paciente",
			"Cambio de cama", "Mostrar camas ocupadas", "Mostrar hospital" });

	static Menu menuCamas = new Menu("Elige una cama de la habitación", Cama.menuCamas());

	static Menu menuSexo = new Menu("Introduzca el sexo del paciente", Sexo.menuSexo());

	public static void main(String[] args) {
		int opcion = 0;

		generarHospital();

		do {
			opcion = menuHospital.gestionar();
			gestionar(opcion);
		} while (opcion != menuHospital.getSalir());
	}

	/**
	 * 
	 */
	private static void generarHospital() {
		try {
			hospital.add("María aaa", Sexo.MUJER, 345, Cama.A);
			hospital.add("Filemón aaa", Sexo.HOMBRE, 760, Cama.D);
			hospital.add("Paco aaa", Sexo.HOMBRE, 760, Cama.A);
			hospital.add("Jhon aaa", Sexo.MUJER, 666, Cama.D);
			hospital.add("Desconocido aaa", Sexo.MUJER, 667, Cama.B);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// private static int idetificador() {
	// return hospital.size() + 1;
	// }

	private static Cama pedirCama() {
		int opcion = menuCamas.gestionar();
		Cama[] camas = Cama.values();
		return camas[opcion - 1];
	}

	private static Sexo pedirSexo() {
		int opcion = menuSexo.gestionar();
		Sexo[] sexo = Sexo.values();
		return sexo[opcion - 1];
	}

	private static int pedirNumHabitacion() {
		return Teclado.leerEntero("Introduzca el número de cama");
	}

	private static String pedirNombre() {
		return Teclado.leerCadena("Introduzca el nombre del paciente");
	}

	private static void gestionar(int opcion) {
		try {
			switch (opcion) {
			case 1:
				add();
				break;

			case 2:
				remove();
				break;

			case 3:
				cambioCama();
				break;

			case 4:
				camasOcupadas();
				break;
			case 5:
				System.out.println(hospital.toString());
				break;

			default:
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * 
	 */
	private static void camasOcupadas() {
		System.out.println("Las camas siguientes están ocupadas:\n"+hospital.camasOcupadas());
	}

	/**
	 * @throws CamaNoExisteException
	 * @throws PacienteYaExisteException
	 * @throws PacienteNoExisteException
	 */
	private static void cambioCama()
			throws CamaNoExisteException, PacienteYaExisteException, PacienteNoExisteException {
		hospital.cambioCama(pedirIdentificador(), pedirNumHabitacion(), pedirCama());
		System.out.println("El paciente ha sido trasladado");
	}

	/**
	 * @throws PacienteNoExisteException
	 */
	private static void remove() throws PacienteNoExisteException {
		System.out.println("El paciente "+hospital.remove(pedirIdentificador())+" ha sido eliminado");
	}

	/**
	 * @throws NombreNoValidoException
	 * @throws CamaNoExisteException
	 * @throws SexoNoValidoException
	 * @throws PacienteYaExisteException
	 */
	private static void add()
			throws NombreNoValidoException, CamaNoExisteException, SexoNoValidoException, PacienteYaExisteException {
		hospital.add(pedirNombre(), pedirSexo(), pedirNumHabitacion(), pedirCama());
	}

	private static int pedirIdentificador() {
		return Teclado.leerEntero("Introduzca el identificador del paciente");
	}

	// public void setIdentificador() {
	// Paciente.setIdentificador(hospital.size());
	// }
}
