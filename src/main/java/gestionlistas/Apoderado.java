package gestionlistas;

public class Apoderado extends Persona {

	private Estudiante estudiante;
	private String numTelefonica;

	public Apoderado() {

	}

	public String getNumTelefonica() {
		return this.numTelefonica;
	}

	public void setNumTelefonica(String numTelefonica) {
		this.numTelefonica = numTelefonica;
	}

	@Override
	public String toString() {
		return super.toString()+"Num.Teléfono;";
	}
}