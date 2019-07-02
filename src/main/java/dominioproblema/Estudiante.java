package dominioproblema;

public class Estudiante extends Persona {

	private Apoderado apoderado;
	private String matricula;

	public Estudiante() {
		super();
		this.apoderado = new Apoderado();
	}

	public String[] datosTabla(){
		String[] datosTabla = toString().split(";");
		return datosTabla;
	}

	@Override
	public String toString(){
	return super.toString()+"Matrícula;"+apoderado.toString();
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Apoderado getApoderado() {
		return apoderado;
	}

	public void setApoderado(Apoderado apoderado) {
		this.apoderado = apoderado;
	}
}