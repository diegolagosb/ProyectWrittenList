package gestionlistas;

public class Estudiante extends Persona {

	private Apoderado apoderado;
	private String matricula;

	public Estudiante() {
		// TODO - implement Estudiante.Estudiante
		throw new UnsupportedOperationException();
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}