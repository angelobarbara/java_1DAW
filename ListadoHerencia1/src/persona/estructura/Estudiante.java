package persona.estructura;

public class Estudiante extends Persona {

	private Curso curso;

	public Estudiante(String nombre, String apellido, String nie, Curso curso) throws NombreNoValidoException, ApellidoNoValidoException {
		super(nombre, apellido, nie);
		setCurso(curso);
	}

	public Curso getCurso() {
		return curso;
	}

	private void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + ", curso " + getCurso() + "]";
	}

}
