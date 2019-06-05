package gestionlistas;

public class Apoderado extends Persona {

	private Estudiante estudiante;
	private String numTelefonica;

	public Apoderado() {
		// TODO - implement Apoderado.Apoderado
		throw new UnsupportedOperationException();
	}

	public String getNumTelefonica() {
		return this.numTelefonica;
	}

	/**
	 * 
	 * @param numTelefonica
	 */
	public void setNumTelefonica(String numTelefonica) {
		this.numTelefonica = numTelefonica;
	}

}