package gestionlistas;

public class Trabajador extends Persona {

	private ControlHorario controlHorario;
	private String numTelefonico;
	private String empresa;
	private String areaTrabajo;
	private String rol;
	private String tipoContrato;

	public Trabajador() {
		// TODO - implement Trabajador.Trabajador
		throw new UnsupportedOperationException();
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

	public String getEmpresa() {
		return this.empresa;
	}

	/**
	 * 
	 * @param empresa
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getAreaTrabajo() {
		return this.areaTrabajo;
	}

	/**
	 * 
	 * @param areaTrabajo
	 */
	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public String getRol() {
		return this.rol;
	}

	/**
	 * 
	 * @param rol
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	/**
	 * 
	 * @param tipoContrato
	 */
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}