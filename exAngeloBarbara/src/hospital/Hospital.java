/**
 * 
 */
package hospital;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author d17barba
 *
 */
public class Hospital {
	private ArrayList<Paciente> hospital = new ArrayList<Paciente>();

	public Hospital() {
		super();
	}

	public void add(String nombre, Sexo sexo, int numHabitacion, Cama cama)
			throws NombreNoValidoException, CamaNoExisteException, SexoNoValidoException, PacienteYaExisteException {
		Paciente paciente = new Paciente(numHabitacion, cama);
		if (hospital.contains(paciente))
			throw new PacienteYaExisteException("La cama está ocupada");
		hospital.add(new Paciente(nombre, sexo, numHabitacion, cama));
	}

	public Paciente remove(int identificador) throws PacienteNoExisteException {
		Paciente paciente = get(identificador);
		if (paciente == null)
			throw new PacienteNoExisteException("El paciente no existe");
		hospital.remove(paciente);
		return paciente;
	}

	public void cambioCama(int identificador, int numHabitacion, Cama cama)
			throws CamaNoExisteException, PacienteYaExisteException, PacienteNoExisteException {
		// Paciente paciente = hospital.get(identificador);
		Paciente paciente = get(identificador);
		if (paciente == null)
			throw new PacienteNoExisteException("El paciente no existe");
		if (hospital.contains(new Paciente(numHabitacion, cama)))
			throw new PacienteYaExisteException("La cama está ocupada");
		// for(Paciente paciente : hospital) {
		// if(paciente.getId() == identificador)
		paciente.setHabitacion(numHabitacion);
		paciente.setCama(cama);
	}

	public int size() {
		return hospital.size();
	}

	private Paciente get(int identificador) {
		for (Paciente paciente : hospital)
			if (paciente.getId() == identificador)
				return paciente;
		return null;
	}

	// public void setIdentificador() {
	// Paciente.setIdentificador(hospital.size());
	// }
	//
	public ArrayList<String> camasOcupadas() {
		ArrayList<String> arrayList = new ArrayList<String>();
//		String[] string = new String[hospital.size()];
		Iterator<Paciente> iterator = hospital.iterator();
//		int i = 0;
		while (iterator.hasNext()) {
			Paciente paciente = (Paciente) iterator.next();
			arrayList.add(paciente.getCama() + "-" + paciente.getHabitacion());
		}
		return arrayList;
//		return string;
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		cadena.append("HOSPITAL");
		for (Paciente paciente : hospital)
			cadena.append("\nid =" + paciente.getId() + ", " + paciente.toString());
		return cadena.toString();
	}

}
