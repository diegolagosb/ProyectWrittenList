package dominioproblema;

public class Deportista extends Persona {


	private double matricula;
	private String planAsignado;
	private String numTelefonico;
	private String fechaMatricula;

	public Deportista() {
		super();
	}

	public String[] datosTabla(){
		String[] datosTabla = toString().split(";");
		return datosTabla;
	}

	@Override
	public String toString() {
		return super.toString()+"Matr�cula;Plan Asignado;Num.Tel�fono;Fecha Inscripci�n;";
	}

	public String getPlanAsignado() {
		return this.planAsignado;
	}


	public void setPlanAsignado(String planAsignado) {
		this.planAsignado = planAsignado;
	}

	public String getNumTelefonico() {
		return this.numTelefonico;
	}


	public void setNumTelefonico(String numTelefonico) {
		this.numTelefonico = numTelefonico;
	}

	public String getFechaMatricula() {
		return this.fechaMatricula;
	}


	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public double getMatricula() {
		return this.matricula;
	}


	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

}