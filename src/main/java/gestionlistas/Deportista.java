package gestionlistas;

public class Deportista extends Persona {

	private FichaMedica fichaMedica;
	private double matricula;
	private String planAsignado;
	private String numTelefonico;
	private String fechaMatricula;

	public Deportista() {
		// TODO - implement Deportista.Deportista
		throw new UnsupportedOperationException();
	}

	public String getPlanAsignado() {
		return this.planAsignado;
	}

	/**
	 * 
	 * @param planAsignado
	 */
	public void setPlanAsignado(String planAsignado) {
		this.planAsignado = planAsignado;
	}

	public String getNumTelefonico() {
		return this.numTelefonico;
	}

	/**
	 * 
	 * @param numTelefonico
	 */
	public void setNumTelefonico(String numTelefonico) {
		this.numTelefonico = numTelefonico;
	}

	public String getFechaMatricula() {
		return this.fechaMatricula;
	}

	/**
	 * 
	 * @param fechaMatricula
	 */
	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public double getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

}